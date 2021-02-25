package day17.collection.map.song;

import java.util.*;
import java.io.*;

public class MainClass {
    static Map<String, List<String>> artists = new HashMap<>();
    static List<String> songs = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 디렉토리를 생성하는 코드
        File f = new File("D:/musics"); // File 객체의 생성자에 생성할 디렉토리 경로를 적음
        if (!f.exists()) { // 해당 경로에 디렉토리가 존재하지 않는다면~~
            f.mkdirs(); // 디렉토리를 만들라는 뜻
        }

//        loadData(); // 저장된 데이터 자동 불러오기 기능
        while (true) {

            loadData();
            showMenu();
            int menu = inputMenu();

            switch (menu) {

                case 1:
                    insertMusic();
                    break;
                case 2:
                    searchMusic();
                    break;
                case 3:
                    deleteMusic();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }
        }
    }

    private static void deleteMusic() {
        System.out.println("\n# 삭제할 아티스트의 이름을 입력해주세요.");
        sc.nextLine();
        System.out.print("- 가수명: ");
        String artist = sc.nextLine();

        if (artists.containsKey(artist)) {
            System.out.println("# [1. 아티스트의 모든 곡 삭제 / 2. 특정 곡 삭제]");
            System.out.print("> ");
            int selectNum = 0;
            try {
                selectNum = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("# 메뉴는 숫자로만 입력하세요.");
                sc.nextLine();
            }

            switch (selectNum) {
                case 1:
                    System.out.printf("%s의 곡 %d개 전부 삭제합니다.\n"
                            , artist, artists.size());
                    artists.remove(artist);
                    saveData();
                    break;
                case 2:
                    System.out.println("현재 등록된 아티스트의 곡: " + artists.get(artist));
                    System.out.print("삭제할 곡을 입력해주세요: ");
                    String songName = sc.next();
                    List<String> songList = artists.get(artist);
                    if (songList.contains(songName)) {
                        int idx = songList.indexOf(artist);
                        songList.remove(idx);
                        System.out.println("# 곡이 삭제되었습니다.");
                    } else {
                        System.out.println("# 등록되지 않은 곡입니다.");
                        sc.nextLine();
                    }
            }
        } else {
            System.out.println("등록된 아티스트가 아닙니다.");
        }

        saveData();
    }

    public static void showMenu() {
        System.out.println("\n\n\n*** 음악 관리 프로그램 ***");
        System.out.printf("# [현재 등록된 가수: %d명]\n", artists.size());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 노래 삭제하기");
        System.out.println("# 4. 프로그램 종료");
        System.out.println("*********************");
    }

    public static int inputMenu() {
        int menu = 0;
        while (true) {
            System.out.print("- 메뉴 입력: ");
            try {
                menu = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("메뉴는 숫자로만 입력하세요.");
                sc.nextLine();
            }
        }
        return menu;
    }

    public static void insertMusic() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        sc.nextLine();
        System.out.print("- 가수명: ");
        String artist = sc.nextLine();
        System.out.print("- 곡명: ");
        String song = sc.nextLine();

        /*
		 1. 가수명이 중복되었는지 확인 후 신규 가수 등록이라면
		 "# 아티스트 xxx님이 신규등록되었습니다."를 출력 후 해당 곡명과 함께
		  컬렉션에 저장하세요.
		 2. 만약 이미 등록되었던 가수명이라면
		 "# 아티스트 xxx님의 노래목록에 xxx이(가) 추가되었습니다."
		 를 출력 후 컬렉션에 저장하세요.
		 3. 가수명과 곡명이 모두 사전에 등록된 정보라면
		 "# 이미 등록된 노래입니다."를 출력하세요.
		 */

        // 신규 아티스트의 노래셋을 생성

        // 신규 아티스트 판단 조건
        if (!artists.containsKey(artist)) { // 신규등록
            songs = new ArrayList<>();
            songs.add(song);
            artists.put(artist, songs);
            System.out.printf("# 아티스트 %s님이 신규 등록되었습니다\n", artist);
        } else { // 기존등록
            List<String> songList = artists.get(artist);
            if (!songList.contains(song)) {
                System.out.printf("# 아티스트 %s님의 노래목록에 '%s'이(가) 추가되었습니다.\n"
                        , artist, song);
                songList.add(song);
            } else {
                System.out.println("# 이미 등록된 노래입니다.");
            }
        }

        saveData();
    }

    public static void searchMusic() {
        sc.nextLine();
        System.out.println("\n# 노래를 검색할 가수명을 입력하세요.");
        System.out.print("- 가수명: ");
        String artist = sc.nextLine();
        /*
		 1. 가수명을 입력받아 해당 가수명에 매핑되어 저장되어있는 List컬렉션을
		  출력하세요.
		  ex) * xxx님의 노래목록 *
		      [abc, def, ghi, jkl ...]
		 2. 등록된 가수가 아니라면 "해당 아티스트는 등록되지 않았습니다."를 출력.
		 */

        if (artists.containsKey(artist)) {
            System.out.printf("\n# %s님의 노래 목록 # \n", artist);
            System.out.println("=============================");
            int number = 1;
            for (String song : artists.get(artist)) {
                System.out.printf("%d. %s\n", number, song);
                number++;
            }
        } else {
            System.out.println("# 해당 아티스트는 등록되지 않았습니다.");
        }

    }

    // 입력된 노래데이터를 저장하는 메서드
    public static void saveData() {

        // 먼저 저장할 경로와 파일명을 변수에 저장
        String fileName = "D:/musics/musics.sav";

        // 파일 저장기능을 하는 java.io 패키지의 api 사용
        FileOutputStream fos = null;

        // 보조스트림 oos는 객체저장 기능을 가지고 있음
        ObjectOutputStream oos = null;

        try {
            //파일 저장을 위한 객체 생성
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);

            // 성적정보가 저장된 리스트를 파일에 저장
            oos.writeObject(artists);

        } catch (FileNotFoundException e) {
            System.out.println("해당 경로가 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (oos != null) try {
                oos.close();
            } catch (Exception e) {
            }
        }
    }

    // 파일에 저장된 정보를 불러오는 메서드
    private static void loadData() {

        String fileName = "D:/musics/musics.sav";

        // 파일 입력(불러오기)을 위한 api
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);

            //readObject는 파일에 저장된 객체를 Object 타입으로 리턴한다.
            artists = (Map<String, List<String>>) ois.readObject();
        } catch (Exception e) {

        } finally {
            if (ois != null) try {
                ois.close();
            } catch (Exception e) {
            }
        }
    }
}