package Revison;


public class NullPointerExceptioon {
    public static void main(String[] args) {
        String name =null;
        try {
            if (name == null) {
                throw new NullPointerException("The name is null.");
            }
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}