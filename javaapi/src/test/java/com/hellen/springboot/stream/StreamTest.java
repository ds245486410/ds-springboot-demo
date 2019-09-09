package com.hellen.springboot.stream;

import com.hellen.springboot.JavaapiApplicationTests;
import com.hellen.springboot.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Slf4j
public class StreamTest extends JavaapiApplicationTests {

    Stream<StudentDTO> stream ;
    ArrayList<StudentDTO> list;

    @Before
    public void init(){
         list = new ArrayList<>();

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setName("张三");
        studentDTO.setAge("11");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(false);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(2L);
        studentDTO.setName("王五");
        studentDTO.setAge("18");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(true);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(3L);
        studentDTO.setName("赵六");
        studentDTO.setAge("83");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(true);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(4L);
        studentDTO.setName("天玄");
        studentDTO.setAge("98");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(true);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(5L);
        studentDTO.setName("田七");
        studentDTO.setAge("38");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(true);
        list.add(studentDTO);

        studentDTO = new StudentDTO();
        studentDTO.setId(6L);
        studentDTO.setName("王八");
        studentDTO.setAge("34");
        studentDTO.setDate(new Date());
        studentDTO.setPassed(false);
        list.add(studentDTO);


        list.add(studentDTO);
        list.add(studentDTO);
        list.add(studentDTO);
        list.add(studentDTO);

         stream = list.stream();


    }

    @Test
    public void  testCollect1(){
        Double collect = stream.collect(Collectors.averagingDouble(new ToDoubleFunction<StudentDTO>() {
            @Override
            public double applyAsDouble(StudentDTO value) {

                return value.getId();
            }
        }));
        System.out.println(collect);
        Double collect1 = list.stream().collect(Collectors.averagingLong(new ToLongFunction<StudentDTO>() {
            @Override
            public long applyAsLong(StudentDTO value) {
                return value.getId();
            }
        }));

        List<Map<String , String>> id = list.stream().flatMap(new Function<StudentDTO, Stream<Map<String , String>>>() {
            @Override
            public Stream<Map<String , String>> apply(StudentDTO studentDTO) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("id", studentDTO.getId().toString());
                Stream.Builder<Map<String , String>> builder = Stream.builder();
                return builder.add(hashMap).build();
            }
        }).collect(Collectors.toList());
        System.out.println(id);

        list.stream().forEachOrdered(new Consumer<StudentDTO>() {
            @Override
            public void accept(StudentDTO studentDTO) {

                //System.out.println(studentDTO.getName());
            }
        });

        List<Map<String, String>> mapList = list.stream().map(new Function<StudentDTO, Map<String, String>>() {
            @Override
            public Map<String, String> apply(StudentDTO studentDTO) {
                Map<String, String> map = new HashMap<>();
                map.put("id", studentDTO.getId().toString());
                return map;
            }
        }).collect(Collectors.toList());
        System.out.println(mapList);

        Optional<StudentDTO> max = list.stream().max(new Comparator<StudentDTO>() {
            @Override
            public int compare(StudentDTO o1, StudentDTO o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        System.out.println(max.get());

        Optional<StudentDTO> reduce = list.stream().reduce(new BinaryOperator<StudentDTO>() {
            @Override
            public StudentDTO apply(StudentDTO studentDTO, StudentDTO studentDTO2) {
                StudentDTO studentDTO1 = new StudentDTO();
                studentDTO1.setName(studentDTO.getName() + studentDTO2.getName());

                return studentDTO1;
            }
        });
        System.out.println(reduce.get());
    }


}
