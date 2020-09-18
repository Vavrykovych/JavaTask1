import Classes.Tasks;
import InstitutionHierarchy.Institution;
import InstitutionHierarchy.InstitutionYearComparator;
import InstitutionHierarchy.School;
import InstitutionHierarchy.University;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Task1----------");
        System.out.println("Input n");
        int n = sc.nextInt();
        System.out.println("Input m");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        Random rand = new Random();
        int range = 1000; // якими числами заповнювати матрицю 0-range
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Math.abs(rand.nextInt()) % range;
            }
        }

        var vector = Tasks.Task1(matrix);
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result: ");
        for (int j : vector) {
            System.out.print(j + " ");
        }
        System.out.println("----------Task2----------");
        String words = "aaata,wordttword,ttt,wordt,wordttt";
        System.out.println("Before\n" + words + "\nAfter");
        Tasks.Task2(words);
        System.out.println("----------Task3----------");
        FileReader fr = new FileReader("data.txt");
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        String[] parsedLine;
        List<Institution> institutions = new ArrayList<Institution>();
        while(line != null){
            parsedLine = line.split(" ");
            if(parsedLine[0].equals("School")){
                institutions.add(new School(parsedLine[1],parsedLine[2],Integer.parseInt(parsedLine[3]),Integer.parseInt(parsedLine[4]),Integer.parseInt(parsedLine[5])));
            }
            else if(parsedLine[0].equals("University")){
                institutions.add(new University(parsedLine[1],parsedLine[2],Integer.parseInt(parsedLine[3]),Integer.parseInt(parsedLine[4]),parsedLine[5]));
            }
            line = reader.readLine();
        }
        System.out.println("Reading from file.");
        for(var i:institutions){
            System.out.println(i);
        }
        System.out.println();
        InstitutionYearComparator comparator = new InstitutionYearComparator();
        institutions.sort(comparator);

        System.out.println("Sorting by foundation year");
        for(var i:institutions){
            System.out.println(i);
        }
        System.out.println();
        School MinStudentsSchool = null;
        for(var i:institutions){
            if(MinStudentsSchool == null && i instanceof School){
                MinStudentsSchool = (School) i;
            }
            else if(i instanceof School && ((School) i).getStudentsNumber() < MinStudentsSchool.getStudentsNumber()){
                MinStudentsSchool = (School) i;
            }
        }
        System.out.println(MinStudentsSchool != null ? "School with min students number" + MinStudentsSchool.toString(): "Schools not find.");
        System.out.println();
        System.out.println("Input acreditation level");
        String level = sc.next();
        for(var i:institutions){
            if(i instanceof University && ((University) i).getAccreditationLevel().equals(level)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
