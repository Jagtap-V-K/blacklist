/*import java.util.Scanner;

public class Main {
    public static void main(String[]     args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            String testCase = scanner.next();
            int totalDestroyedWalls = countDestroyedWalls(testCase);
            System.out.println(totalDestroyedWalls);
        }

        scanner.close();
    }

    public static int countDestroyedWalls(String testCase) {
        int totalDestroyedWalls = 0;
        int n = testCase.length();

        for (int i = 0; i < n; i++) {
            if (testCase.charAt(i) == 'B') {
                // If a bomb is found, count the walls it will destroy on both sides
                totalDestroyedWalls += 2;
            }
        }
        return totalDestroyedWalls;
    }
}
*/

// correct code
import java.util.*;
 
public class bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
 
        while (t-- > 0) {
            String s = scanner.next();
            int[] which = new int[s.length()]; // to store the bombs and walls
            int j = 0;
 
            Map<Integer, Integer> mp = new HashMap<>(); // to store the positions of the bombs
 
            for (char i : s.toCharArray()) {
                if (i == 'W')
                    which[j] = 1;
                else {
                    which[j] = 0;
                    mp.put(j, 1);
                }
 
                j++;
            }
 
            int count = 0;
 
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                int pos = entry.getKey();
 
                if (pos - 2 >= 0) { // two steps back from the bomb
                    if (which[pos - 2] == 1) {
                        count++;
                        which[pos - 2] = -1;
                    }
                }
 
                if (pos - 1 >= 0) { // one step back from the bomb
                    if (which[pos - 1] == 1) {
                        count++;
                        which[pos - 1] = -1;
                    }
                }
 
                if (pos + 1 < s.length()) { // one step forward from the bomb
                    if (which[pos + 1] == 1) {
                        count++;
                        which[pos + 1] = -1;
                    }
                }
 
                if (pos + 2 < s.length()) { // two steps forward from the bomb
                    if (which[pos + 2] == 1) {
                        count++;
                        which[pos + 2] = -1;
                    }
                }
            }
 
            System.out.println(count);
        }
 
        scanner.close();
    }
}




/*              cpp code used

#include<bits/stdc++.h>
using namespace std;
#define fast ios::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL)


int main(){
  fast;
  int t;
  cin>>t;
  while(t--){

    string s;
    cin>>s;

    int which[s.length()]; //to store the bombs and walls
    int j=0;

    map<int,int> mp; //to store the positions of the bombs

    for(auto i :s){
      if(i == 'W')
        which[j] = 1;
      else {
        which[j] = 0;
        mp[j] = 1;
      }

      j++;
    }

    int count = 0;

    for(auto it = mp.begin(); it != mp.end() ; it++){
      int pos = it->first;

      if(pos - 2 >= 0){ //two steps back from the bomb
        if(which[pos-2] == 1){
          count++;
          which[pos-2] = -1;
        }
      }

      if(pos - 1 >= 0){ //one step back from the bomb
        if(which[pos-1] == 1){
          count++;
          which[pos-1] = -1;
        }
      }

      if(pos + 1 < s.length()){ //one step forward from the bomb
        if(which[pos+1] == 1){
          count++;
          which[pos+1] = -1;
        }
      }

      if(pos + 2 < s.length()){ //two steps forward from the bomb
        if(which[pos+2] == 1){
          count++;
          which[pos+2] = -1;
        }
      }

    }

    cout<<count<<endl;

  }

  return 0;
}



 */