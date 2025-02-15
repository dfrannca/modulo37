public class App {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("App");
        emf.close();
    }
}