package bxl.formation;

public class ResourceLoader {

    String getResourceFile(String resource){
        return getClass().getClassLoader().getResource(resource).getFile();
    }
}
