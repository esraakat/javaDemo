public class Main {

    public static void main(String[] args) {

        String message = "Today weather is very nice!";
        System.out.println(message);

        System.out.println("The number of elements: " + message.length());
        System.out.println("7th elements: " + message.charAt(6));
        System.out.println(message.concat(" Go out!"));
        System.out.println(message);
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[7];
        message.getChars(0, 7, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf("a"));
        System.out.println(message.indexOf("lia"));
        System.out.println(message.lastIndexOf("a"));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());  //String'in başındaki ve sonundaki boşlukları kaldırır.

    }
}
