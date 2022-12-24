public class ForEach {
    public static void main(String[] args) {

        // Tanpa For Each
        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        // For Each
        System.out.println("FOR EACH");

        for (String name: names){
            System.out.println(name);
        }
    }
}