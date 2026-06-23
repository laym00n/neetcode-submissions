class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;

        // Step 1: Count student preferences
        for (int s : students) {
            if (s == 0) count0++;
            else count1++;
        }

        // Step 2: Iterate through sandwiches in their fixed order
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (count0 > 0) {
                    count0--; // A student who wants 0 takes it
                } else {
                    // No student left wants 0, line is stuck
                    return count1; 
                }
            } else {
                if (count1 > 0) {
                    count1--; // A student who wants 1 takes it
                } else {
                    // No student left wants 1, line is stuck
                    return count0;
                }
            }
        }

        return 0; // Everyone was fed
    }
}