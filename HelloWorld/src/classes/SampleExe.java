//내가 알기로 get,set메소드는 클래스에서 private로 보호된 변수의 값을 지정하고 가져오기 위해서 사용하는것으로 알고 있다.
//
// 
//
//이에 관한 포스팅은 다음으로 미루고~ 일단 오늘은 이렇게 간단하게 get,set 메소드를 사용하는법만 포스팅 한다!
//
// 
//
//그리고 마지막으로....... 조금 길지만 ... 정석도 아니지만... get,set은 변수의 수만큼 꼭 만들어주는건 아니지만 나중에 필요한 private로 선언된 변수
//
// 
//
//수만큼 쓰기에  모든 변수에 get,set을 주면 다음과 같다


public class Main {

 public static void main(String[] args) {

  Name name = new Name("홍길동", "임꺽정");

  System.out.println(name.getMyName() + name.getYourName());

 }
}

class Name {
 String myName;
 String yourName;

 public Name(String myName, String yourName) { // 생성자 메소드

  setMyName(myName);
  setYourName(yourName);

 }

 public String getMyName() {
  return myName;
 }

 public String getYourName() {
  return yourName;
 }

 public void setMyName(String myName) {
  this.myName = myName;

 }

 public void setYourName(String YourName) {
  this.yourName = YourName;

 }
}

 

