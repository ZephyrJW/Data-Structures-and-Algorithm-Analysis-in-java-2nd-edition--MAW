public static void josephus(int m, int n){
  long start = System.currentTimeMillis();
  Integer[] people = new Integer[n];
  for(int i=0; i<n; i++){
    people[i] = i;
  }
  List<Integer> list = Arrays.asList(people);
  Arraylist<Integer> lists = new ArrayList<Integer>(list);
  
  int current = 0, deadman = 0;
  
  while(deadman < n-1){
    int k = m%(n-deadman);
    lists.remove((current + k)%lists.size());
    deadman++;
    current= (current+k) % (lists.size()+1);
  }
  
  System.out.println("winner is num:"+list.get(0));
  long end = System.currentTimeMillies();
  System.out.println("time consume:"+ (end-start));
}
