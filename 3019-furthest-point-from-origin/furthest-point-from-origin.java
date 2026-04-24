class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int rightMoves=0;
        int leftMoves=0;
        int spaces=0;
        for(int i=0;i<moves.length();i++) {
            if(moves.charAt(i)=='L') leftMoves++;
            else if(moves.charAt(i)=='R') rightMoves++;
            else if (moves.charAt(i)=='_') spaces++;
        }
        return Math.abs(rightMoves-leftMoves)+spaces;
        
    }
}