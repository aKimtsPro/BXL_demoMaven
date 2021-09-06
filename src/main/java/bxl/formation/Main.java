package bxl.formation;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.w3c.dom.ls.LSOutput;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File( new ResourceLoader().getResourceFile("file.txt") ))){

            System.out.println( sc.nextLine() );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        PersonMapper mapper = Mappers.getMapper(PersonMapper.class);
//
//        Person p = new Person("luc",15);
//        System.out.println(p);
//
//        PersonDTO p2 = mapper.entityToDTO(p);
//        System.out.println(p2);
//
//        p = mapper.DTOToEntity(p2);
//        System.out.println(p);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("profiled-persist");
        EntityManager em = emf.createEntityManager();

        List<Section> list = em.createQuery("SELECT s FROM Section s").getResultList();

        list.forEach(System.out::println);



    }

}
