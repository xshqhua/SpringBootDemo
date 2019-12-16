/**
 * @Package : springboot.demo.hello
 * @Description : TODO
 * @Create on : 2019/12/11 16:48
 * @Author XSH
 * @Email xshqhua@gmail.com
 * @version v1.0.0
 **/
package springboot.demo.hello;

import java.util.*;

public class HelloController {
    public static void main(String[] args) {
        int[] nums = new int[]{22, 22, 11, 22, 21, 12};
        HelloController helloController = new HelloController();
        System.out.println(Arrays.toString(helloController.yy(nums, 44)));
    }

    public int[] xx(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        /*for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
//            map.put(target - nums[i], i);
        }*/
//        System.out.println(map);
        return null;
    }

    public int[] yy(int[] nums, int target) {
        List list = new ArrayList<>();
        int[] t = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    Map<Integer, Integer> map = new HashMap<>();
                    map.put(nums[i], i);
                    map.put(nums[j], j);
                    list.add(map);
                }
            }
        }
        System.out.println(list);
        return null;
    }
}
