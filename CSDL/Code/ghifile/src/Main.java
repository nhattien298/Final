import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        List<Student> list = m.docFile();
        for (Student sv: list
             ) {
            System.out.println( sv);
        }

//        String txt = "tap ghi file ne";   `
//        String [] arr ={"tue lam", "tue man"};
//        Student sv1 = new Student("nhattien", 13, 8.9);
//        Student sv2 = new Student("tuelam", 78, 4);
//        Student sv3 = new Student("tueman", 20, 7);
//        Student sv4 = new Student("thimai", 15, 8);
//        Student sv5 = new Student("hangxom", 17, 10);
//
//        List<Student> danhSach = new ArrayList<>();
//        danhSach.add(sv1);
//        danhSach.add(sv2);
//        danhSach.add(sv3);
//        danhSach.add(sv4);
//        danhSach.add(sv5);
//        System.out.println(docFile());;
    }
    public void ghiFile(List<Student> danhSach){


        try {
            FileWriter fw = new FileWriter("nhattiencsdl.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student sv :danhSach
            ) {
                bw.write(sv.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Student>  docFile(){
        List<Student> list = new ArrayList<>();

        try {
            FileReader fr = new FileReader("nhattiencsdl.txt");
            BufferedReader br = new BufferedReader(fr);

            String line ="";
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }else {
                    String txt[] = line.split("\t");
                    String name = txt[0];
                    int age = Integer.parseInt(txt[1]);
                    double mark = Double.parseDouble(txt[2]);

                    list.add(new Student(name, age, mark));

                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  list;

    }
}
