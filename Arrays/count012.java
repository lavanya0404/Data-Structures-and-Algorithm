// import java.util.*;
// public class count012{
//   public static void swap( ArrayList<Integer>list,int i , int j){
//     int temp = list.get(i);
    // System.err.println(temp);
    // System.out.println("i "+i+" j "+j);
//     list.set(i,list.get(j));
//     list.set(j,temp);
    // System.out.println("i "+i+" j "+j);
//   }
//   public static void main(String[] args) {
//     ArrayList <Integer> list = new ArrayList<>();
//     list.add(0);
//     list.add(1);
//     list.add(2);
//     list.add(0);
//     list.add(1);
//     list.add(2);
//     list.add(2);
//     list.add(1);
//     list.add(2);
//     list.add(0);
//   int zero=0,one=0,two=0;
//     for(int i=0;i<list.size();i++){
//       if(list.get(i)==0){
//         zero++;
//       }
//       else if(list.get(i)==1){
//         one++;
//       }
//       else if(list.get(i)==2){
//         two++;
//       }
//     }    
//   System.out.println("Count of 0 , 1 , 2 "+zero+" , "+one+" , "+two);
//   ArrayList <Integer> list2 = new ArrayList<>();
//   for(int i=0; i<zero; i++){
//     list2.add(0);
//   }
//   for(int i=0;i<one;i++){
//     list2.add(1);
//   }
//   for(int i=0;i<two;i++)
//   {
//     list2.add(2);
//   }
//   System.out.println(list2);


// without using extra place and changing same array
// int i = 0;
// while(i!=zero){
// list.set(i,0);
// i++;
// }
// while(i<(one+zero)){
//   list.set(i,1);
//   i++;
//   }
//   while(i<(two+one+zero)){
//     list.set(i,2);
//     i++;
//     }
    
//   System.out.print(list); 


//   using 3 pointer approach
//   int l=0,m=0;
//   int h = list.size()-1;
//   while(m<h){   
//     if(list.get(m)==0){
//       swap(list, l, m);
//       l++;
//       m++;
//     }
//     else if (list.get(m)==1){
      // swap(list, h, h);
//       m++;
//     }
//     else{
//     swap(list, m, h);
//     h--;
//     }
//   }
//   System.out.print(list+" ");
// }
// }
