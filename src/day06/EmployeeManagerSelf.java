package day06;

import java.util.Scanner;

public class EmployeeManagerSelf {

    // 모든 메서드에서 스캐너를 사용하기 위한 변수 선언
    // 클래스에서 뭔가를 선언하려면 static을 붙여야 함
    static Scanner sc = new Scanner(System.in);

    //현재 저장된 사원 수
    static int count = 0;

    // 사원 정보를 저장할 배열들
    static String[] empNumbers = new String[count];
    static String[] names = new String[count];
    static String[] ages = new String[count];
    static String[] departments = new String[count];


    // 메뉴를 출력해주는 메서드
    static void showMenu() {
        System.out.println("\n========= 사원 관리 프로그램 =========");
        System.out.println("# 1. 사원 정보 신규 등록");
        System.out.println("# 2. 모든 사원 정보 보기");
        System.out.println("# 3. 사원 정보 검색");
        System.out.println("# 4. 사원 정보 수정");
        System.out.println("# 5. 사원 정보 삭제");
        System.out.println("# 6. 프로그램 종료");
        System.out.println("=====================================");
    }

    // 프로그램을 종료하는 메서드
    static void exitProgram() {
        System.out.println("프로그램을 종료합니까? [y/n]");
        System.out.print("> ");
        String answer = sc.next();

        switch (answer) {
            case "Y":
            case "y":
            case "ㅛ":
                sc.close();
                System.exit(0); // 프로그램 종료 메서드
            case "N":
            case "n":
            case "ㅜ":
                System.out.println("프로그램 종료를 취소합니다.");
                return;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }

    // 배열 추가 기능을 수행하는 메서드
    static String[] append(String[] arr, String data) {
        // 배열의 사이즈를 1 증가시킴
        String[] temp = new String[count + 1];
        for (int i = 0; i < count; i++) {
            temp[i] = arr[i];
        }

        //새로운 데이터를 추가
        temp[temp.length - 1] = data;
//        System.out.println("temp: " + Arrays.toString(temp));
        return temp;
    }

    // 사원 정보 등록을 위한 메서드
    static void insertEmpData() {
        System.out.println("# 사원정보 등록을 시작합니다.");

        System.out.print("- 사번: ");
        String empNum = sc.next();

        System.out.print("- 이름: ");
        String name = sc.next();

        System.out.print("- 나이: ");
        String age = sc.next();

        System.out.print("- 부서: ");
        String dep = sc.next();

        // 배열 사이즈를 증가시키고 데이터를 추가하는 함수
        empNumbers = append(empNumbers, empNum);
        names = append(names, name);
        ages = append(ages, age);
        departments = append(departments, dep);
        count++;

//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(departments));
//        System.out.println("사원수: " + count);
    }

    // 모든 사원 정보를 보여주는 메서드
    static void showEmpData() {
        if (count >= 1) {
            System.out.println("================ 전체 사원 정보 ================");
            System.out.println("사번          이름          나이          부서  ");
            System.out.println("==============================================");

            for (int i = 0; i < count; i++) {
                System.out.printf("%s         %s           %s세          %s\n"
                        , empNumbers[i], names[i], ages[i], departments[i]);
            }
            System.out.println("==============================================");
        } else {
            System.out.println("등록된 사원 정보가 없습니다.");
        }
    }

    // 사원 정보 검색을 위한 메서드
    static void searchEmpData() {
        System.out.println("# 조회하실 사원의 번호를 입력하세요.");
        System.out.print("> ");
        String search = sc.next();

        for (int i = 0; i < count; i++) {
            if (empNumbers[i].equals(search)) {
                System.out.println("================ 조회된 사원 정보 ================");
                System.out.println("사번          이름          나이          부서  ");
                System.out.println("===============================================");
                System.out.printf("%s        %s         %s세        %s\n"
                        , empNumbers[i], names[i], ages[i], departments[i]);
                System.out.println("===============================================");
                return;
            }
        }
        System.out.println("조회하신 사원 정보는 존재하지 않습니다.");
    }

    // 사원 정보 수정을 위한 메서드
    static void modEmpData() {
        System.out.println("# 수정하실 사원의 번호를 입력하세요.");
        System.out.print("> ");
        String modSearch = sc.next();

        for (int i = 0; i < count; i++) {
            if (empNumbers[i].equals(modSearch)) {
                System.out.printf("%s님의 정보를 수정합니다.\n", names[i]);
                System.out.println("[ 1. 나이 변경 | 2. 부서 변경 | 3. 취소]");
                System.out.print("> ");
                String modNum = sc.next();

                switch (modNum) {
                    case "1":
                        System.out.println("-변경하실 나이를 입력하세요.");
                        System.out.print("> ");
                        String modAge = sc.next();
                        System.out.printf("나이가 %s세에서 %s세로 변경되었습니다.\n", ages[i], modAge);
                        ages[i] = modAge;
                        return;
                    case "2":
                        System.out.println("-변경하실 부서를 입력하세요.");
                        System.out.print("> ");
                        String modDep = sc.next();
                        System.out.printf("부서가 %s에서 %s로 변경되었습니다.\n", departments[i], modDep);
                        departments[i] = modDep;
                        return;
                    case "3":
                        System.out.println("# 정보 수정을 취소합니다.");
                        return;
                }
            }
        }
        System.out.println("조회하신 사원 정보는 존재하지 않습니다.");
    }

    // 사원 정보 삭제를 위한 메서드
    static void delEmpData() {
        System.out.println("# 삭제하실 사원의 번호를 입력하세요.");
        System.out.print("> ");
        String delSearch = sc.next();

        for (int i = 0; i < count; i++) {
            if (empNumbers[i].equals(delSearch)) {
                System.out.printf("# %s님의 정보를 삭제합니다. [y/n]\n", names[i]);
                System.out.print("> ");
                String answer = sc.next();

                switch (answer) {
                    case "Y":
                    case "y":
                    case "ㅛ":
                        System.out.printf("# %s님의 정보가 정상적으로 삭제되었습니다.\n", names[i]);

                        for (int idx = i; idx < count - 1; idx++) {
                            empNumbers[idx] = empNumbers[idx+1];
                            names[idx] = names[idx+1];
                            ages[idx] = ages[idx+1];
                            departments[idx] = departments[idx+1];
                        }

                        String[] temp1 = new String[count-1];
                        String[] temp2 = new String[count-1];
                        String[] temp3 = new String[count-1];
                        String[] temp4 = new String[count-1];
                        for (int n=0; n < temp1.length; n++) {
                            temp1[n] = empNumbers[n];
                            temp2[n] = names[n];
                            temp3[n] = ages[n];
                            temp4[n] = departments[n];
                        }
                        empNumbers = temp1; temp1 = null;
                        names = temp2; temp2 = null;
                        ages = temp3; temp3 = null;
                        departments = temp4; temp4 = null;

                        count--;
                        return;
                    case "N":
                    case "n":
                    case "ㅜ":
                        System.out.println("# 정보 삭제를 취소합니다.");
                        return;
                    default:
                        System.out.println("해당 번호는 존재하지 않습니다.");
                        return;
                }
            }
        }
    }


    public static void main(String[] args) {


        while (true) {
            showMenu();
            System.out.print("> ");
            int menuNum = sc.nextInt();

            if (menuNum == 1) {
                insertEmpData();
            } else if (menuNum == 2) {
                showEmpData();
            } else if (menuNum == 3) {
                searchEmpData();
            } else if (menuNum == 4) {
                modEmpData();
            } else if (menuNum == 5) {
                delEmpData();
            } else if (menuNum == 6) {
                //프로그램 종료 코드
                exitProgram();

            } else {
                System.out.println("메뉴를 잘못 입력했습니다.");
            }

        }
    }
}
