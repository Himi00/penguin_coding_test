import java.util.*;

class trash {
public static void main(String args[] ) {
System.out.println("enter bag number");	
	
Scanner s = new Scanner(System.in);
int n = s.nextInt();
System.out.println("enter bag weight");
float arr[] = new float[n];

for(int x=0;x<n;x++)
arr[x] = s.nextFloat();
Arrays.sort(arr);
int left = 0;
int right = arr.length - 1;
int count = 0;
while(left <= right){
if(left == right){
count++;
break;
}
if(arr[left] + arr[right] <= 3.0){
left++;
right--;
count++;
}
else{
right--;
count++;
}
}


System.out.println(count);
s.close();
}
}