/*
 * You are given a list of file names. Each file name follows a specific naming convention, where the valid format is "File_x", where x is a positive integer representing the version number. Some file names in the list may not follow this format. Your task is to find and return the highest version number among the valid file names.

Input:
An array of strings words containing file names. Each string may or may not follow the "File_x" format.
Output:
The highest version number x found in the valid file names. If no valid file names are found, return a special value (e.g., Integer.MIN_VALUE).
Valid file name format:
A valid file name starts with "File_" followed by a positive integer. No other characters should be present after the integer.
 */
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
