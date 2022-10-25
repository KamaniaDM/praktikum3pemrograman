//Dadu praktikum3.soal1

package praktikum3.soal1;
import java.util.LinkedList;

public class Dadu {
    public int input;
    public int min = 1;
    public int max = 6;
    int total;

    public void setDadu(int input){this.input = input;}

    void acakNilai(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        for (int i = 0; i < input; i++){
            int nilai_dadu = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai "+ nilai_dadu);
            total += nilai_dadu;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}