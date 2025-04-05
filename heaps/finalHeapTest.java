package ron.heaps;

import java.util.Arrays;

public class finalHeapTest {

    public static void main(String[] args) {
        testGetValue();
        testSwapAndUpdate();
        testBuildHeap();
        testHeapInsert();
        testAddToKeys();
        testFindInHeap();
        
        System.out.println("\n✅ bah All tests passed successfully!");
    }

    static void testGetValue() {
        int[] heap = {100, -30, -40, -50, 20, -50};
        int val = finalHeap.getValue(heap, 3);
        assert val == 50 : "getValue failed. Expected 50, got " + val;
    }

    static void testSwapAndUpdate() {
        int[] heap = {100, -30, -40, -50, 20, -50};
        finalHeap.swapAndUpdate(heap, 1, 2);
        int[] actual = finalHeap.getActualHeap(heap);
        assert actual[1] == 60 && actual[2] == 70 : "swapAndUpdate failed: " + Arrays.toString(actual);
    }

    static void testBuildHeap() {
        int[] heap = {100, 70, 60, 20, 50, 10};
        int[] mod = new int[heap.length];
        mod[0] = heap[0];
        for (int i = 1; i < heap.length; i++) {
            mod[i] = heap[i] - heap[(i - 1) / 2];
        }

        finalHeap.buildHeap(mod);
        int[] actual = finalHeap.getActualHeap(mod);
        for (int i = 0; i < actual.length / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < actual.length)
                assert actual[i] >= actual[left] : "buildHeap violated max-heap property";
            if (right < actual.length)
                assert actual[i] >= actual[right] : "buildHeap violated max-heap property";
        }
    }

    static void testHeapInsert() {
        int[] heap = {100, 70, 60, 20, 50, 10};
        int[] mod = new int[heap.length];
        mod[0] = heap[0];
        for (int i = 1; i < heap.length; i++) {
            mod[i] = heap[i] - heap[(i - 1) / 2];
        }

        int[] newHeap = finalHeap.heapInsert(mod, 85);
        int[] actual = finalHeap.getActualHeap(newHeap);
        boolean found = false;
        for (int val : actual) {
            if (val == 85) {
                found = true;
                break;
            }
        }
        assert found : "heapInsert failed to insert 85: " + Arrays.toString(actual);
    }

    static void testAddToKeys() {
        int[] heap = {100, 70, 60, 20, 50, 10};
        int[] mod = new int[heap.length];
        mod[0] = heap[0];
        for (int i = 1; i < heap.length; i++) {
            mod[i] = heap[i] - heap[(i - 1) / 2];
        }

        finalHeap.addToKeys(mod, 10);
        int[] actual = finalHeap.getActualHeap(mod);
        assert actual[0] == 110 : "addToKeys failed. Expected root 110, got " + actual[0];
    }

    static void testFindInHeap() {
        int[] heap = {100, 70, 60, 20, 50, 10};
        int[] mod = new int[heap.length];
        mod[0] = heap[0];
        for (int i = 1; i < heap.length; i++) {
            mod[i] = heap[i] - heap[(i - 1) / 2];
        }

        finalHeap.buildHeap(mod);
        Integer idx = finalHeap.findInHeap(mod, 70);
        assert idx != null : "findInHeap failed to find 70";

        Integer notFound = finalHeap.findInHeap(mod, 999);
        assert notFound == null : "findInHeap should return null for 999";
    }
}
