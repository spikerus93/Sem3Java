import java.util.*;

public class Sem3 {
    public static void main(String[] args){
        List<List<String>> list = new ArrayList<>();
            addBook( "Pushkin","Classic" ,list);
            addBook("Pushkin", "Roman", list);
            addBook("EO", "Roman",list);
            addBook("M&M","Classic", list);
            addBook( "Sherlock","Detective", list);

            System.out.println(list);
        }


    static void task1(){
        //     **Текст задачи:**
//Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//
//String s1 = "hello";
//
//String s2 = "hello";
//
//String s3 = s1;
//
//String s4 = "h" + "e" + "l" + "l" + "o";
//
//String s5 = new String("hello");
//
//String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//</aside>


        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
    }
        static void task1(List<Integer> list){
//        Текст задачи:
//Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и
// вывести его на экран.
            Collections.sort(list);
            System.out.println(list);



            }
        static List<Integer> createList(int size, int min, int max){
            ArrayList<Integer> list = new ArrayList<>(size);
            Random random = new Random();
            for (int i = 0; i < size; i++) {
//                list.add(random.nextInt(min,max));
                list.add((int) (Math.random() * (max - min + 1) + min));

            }
            System.out.println(list);
            return list;


        }

        static void task2(){
//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
            ArrayList<Object> list = new ArrayList<>();
            list.add("dsgksdkgjk");
            list.add(123);
            list.add("dsgksdkgjk");
            list.add(122343);
            list.add(122.3);
            list.add(12);

            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                Object o = iterator.next();
                if (o instanceof Double){
                    iterator.remove();
                }
            }
            System.out.println(list);
        }

        static void addBook(String name, String genre, List<List<String>> bookShop){
//        Каталог товаров книжного магазина сохранен
//        в виде двумерного списка List<ArrayList<String>> так,
//        что на 0й позиции каждого внутреннего списка содержится название жанра,
//        а на остальных позициях - названия книг.
//        Напишите метод для заполнения данной структуры.

                for (int i = 0; i < bookShop.size(); i++) {
                    if (bookShop.get(i).get(0).equals(genre)){
                        bookShop.get(i).add(name);
                        return;
                    }

                }
                List<String> list = new ArrayList<>();
                list.add(genre);
                list.add(name);
                bookShop.add(list);

        }


}
