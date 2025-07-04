package Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudyForFinal {

    public interface GrabBag <E > {
        void insert ( E item ) ;
        E sample () ;
        E remove () ;
    }

    public class GB<E> implements GrabBag<E>{

        List<E> items = new ArrayList<E>();

        @Override
        public void insert(E item) {
            this.items.add(item);
        }

        @Override
        public E sample() {
            int randomIndex= new Random().nextInt(items.size());

            return items.get(randomIndex);

        }

        @Override
        public E remove() {
            int randomIndex= new Random().nextInt(items.size());
            E item = this.items.get(randomIndex);
            E last = this.items.getLast();
            this.items.set(randomIndex, last);
            this.items.removeLast();
            return item;

        }
    }

    public class Coordinance{

        SortedMap<String, SequencedSet<Integer>> map = new TreeMap<>();

        public Coordinance(String fileName) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(fileName));
            int lineNumber=1;

            while(sc.hasNextLine()){

                String line = sc.nextLine();
                Scanner lineScanner = new Scanner(line);

                while(lineScanner.hasNext()){
                    String token = lineScanner.next();
                    if (!map.containsKey(token)) {
                        map.put(token, new LinkedHashSet<>());
                    }

                    map.get(token).add(lineNumber);
                }
                lineNumber++;
            }


        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();

            for(String s : map.keySet()){
                sb.append(s + ": ");

                Iterator<Integer> it = map.get(s).iterator();

                while(it.hasNext()){
                    sb.append(it.next());
                    if(it.hasNext()){
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

            return sb.toString();
        }
    }






    public static void main(String[] args){

    }




}
