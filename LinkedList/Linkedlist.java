import java.util.*;
public class Linkedlist {
    

	public static void main (String[] args) {

	String[] things = {"orange","noobs","pwnge","ham","boats"};
	List<String> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(things));

	String[] things2 = {"sausage","ham","boats","harrypotter"};
	List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(things2));
        
	list1.addAll (list2);
	list2 = null;

	printMe (list1);
	removedStuff(list1, 2,5);
	printMe(list1);
	reverseMe(list1);
}
//printMe method
private static void printMe(List<String> l) {
    l.stream().forEach((b) -> {
        System.out.printf("%s ", b);
    });
	System.out.println();
}
//removedStuff method
private static void removedStuff(List<String> l,int from,int to) {
	l.subList(from, to).clear();
}
//reverseMe
private static void reverseMe(List<String> l) {
	ListIterator<String> bobby = l.listIterator(l.size());
	while(bobby.hasPrevious())
		System.out.printf("%s ",bobby.previous());
}
}
    