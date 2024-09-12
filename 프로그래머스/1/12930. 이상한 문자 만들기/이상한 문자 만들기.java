class Solution {
    public String solution(String s) {
        String answer = "";
          String[] a=s.split(" ",-1);

          for(int i=0; i<a.length; i++){
              String msg=a[i];
              for(int j=0; j<msg.length(); j++){
                  if(j%2==1){
                     String b=Character.toString(msg.charAt(j));
                     answer+=b.toLowerCase();
                  }else{
                      String b=Character.toString(msg.charAt(j));
                         answer+=b.toUpperCase();
                  }
              }
              if(i==a.length-1){break;}
              answer+=" ";
          }

          return answer;
    }
}