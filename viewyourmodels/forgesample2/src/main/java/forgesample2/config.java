package forgesample2;

import java.util.ArrayList;

public class config {

    // set environment variables or hard-code here 
    public static class credentials{
        public static String client_id = "Dz84TZaq7LJxW1Q4Th1exrPLK5K1nYq8";
        public static String client_secret = "GMwTi64p03uAg1OK";
    }; 

    // Required scopes for your application on server-side
    public static ArrayList<String> scopeInternal = new ArrayList<String>() {{
        add("bucket:create");
        add("bucket:read");
        add("data:read");
        add("data:create");
        add("data:write");
    }};

    // Required scope of the token sent to the client
    public static ArrayList<String> scopePublic = new ArrayList<String>() {{
        add("viewables:read");
    }};

}
