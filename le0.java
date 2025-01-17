/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class le0
{
		String name;
        int age; 
        void setAge(int age){
            this.age = age;
        }
        void setName(String name){
            this.name = name;
        }
        String getName(){
            return this.name;
        }
        int getAge(){
            return this.age;
        }
        public static void main(String[] args) {
            le0 m1 = new le0();
            m1.setName("Prabhat");
            m1.setAge(20);
            System.out.println(m1.getName() + m1.getAge());
        }
}
