class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited = new boolean[n];
        visited[0]=true;
        bfs(0,visited,rooms);
        for(boolean check:visited) {
            if(!check) return false;
        }
        return true;
    }
    void bfs(int idx,boolean[] visited,List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        while(q.size()>0) {
            int front=q.remove();
            for(int key:rooms.get(front)) {
                if(!visited[key]){
                    visited[key]=true;
                    q.add(key);;
                }    
            }
        }
         


    }
}