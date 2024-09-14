public class FileCurrentVersion {
    public static void main(String[] args) {
        String[] words={"File_1","File_3","File_2","File_4","Filee_3j","File_l9","File_3l_45"};
        int latest_version=Integer.MIN_VALUE;
        int current_version;
        for(String word:words){
            String[] temp=word.split("_");
                if(temp.length==2 && temp[0].equals("File") && temp[1].matches("\\d+")){
                    current_version=Integer.parseInt(temp[1]);
                    latest_version=Math.max(latest_version, current_version);
                }
        }
        System.out.println(latest_version);
    }
}
