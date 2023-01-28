package BigO;
// elimizdeki veri seti arttıkça . çalıştırılma süreside doğru orantılı olarak artıyor
public class On {  // O(n)  --- > Linear Complexity

    public static void main(String[] args) {
        int[] arr = {10,2,20,40,55,7}; //6 eleman
        for (int item: arr) {
            System.out.println(item + ", "); // 6 işlem
        }
    }
}
