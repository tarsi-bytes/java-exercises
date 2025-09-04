package codewars.level7kyu;

public class RemoveUrlAnchor {
    public static String removeUrlAnchor(String url) {
        int index = url.indexOf("#"); // find position of '#'

        if (index == -1) {
            return url; // no '#' found, return original
        }
        return url.substring(0, index); // return part before '#'
    }

    public static void main(String[] args) {
        System.out.println(RemoveUrlAnchor.removeUrlAnchor("www.codewars.com#about")); // www.codewars.com
        System.out.println(RemoveUrlAnchor.removeUrlAnchor("www.codewars.com/katas/?page=1#about")); // www.codewars.com/katas/?page=1
    }
}
