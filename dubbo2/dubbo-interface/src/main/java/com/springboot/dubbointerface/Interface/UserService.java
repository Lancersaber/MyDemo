package com.springboot.dubbointerface.Interface;

import com.springboot.dubbointerface.bean.UserAdderss;

import java.util.Arrays;
import java.util.List;

public interface UserService {

    public List<UserAdderss> getAddress(String id);
    /**
     * {
     *         UserAdderss userAdderss1 = new UserAdderss(1, "Mike", "北京");
     *         UserAdderss userAdderss = new UserAdderss(2, "Jack", "北京");
     *
     *         return Arrays.asList(userAdderss,userAdderss1);
     *     }
     */
}
