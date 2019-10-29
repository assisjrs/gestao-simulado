package work.assisjrs.simulado;

public class Helper {
    public static String url(final int port, final String context){
        return "http://localhost:" + port + context;
    }
}
