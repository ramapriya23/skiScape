package com.stratsys.skiScape.SkiRecommend;


import com.stratsys.skiScape.models.SkiType;
import com.stratsys.skiScape.models.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SkiRecommendUT {

    @Autowired
    SkiRecommendService skiRecommendService;

    @Test
     public void whenHeightMoreThan200Klassisk_getEmptyArray(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(30);
        userInfo.setHeight(200);
        userInfo.setType(SkiType.KLASSISK);
        List<Integer> result = skiRecommendService.getSkilengthRecommendations(userInfo);
        assertSame(new ArrayList<Integer>().isEmpty(),result.isEmpty());
    }

    @Test
    public void whenHeightLess190Klassisk_getSkiLengths(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(20);
        userInfo.setHeight(180);
        userInfo.setType(SkiType.KLASSISK);
        List<Integer> result = skiRecommendService.getSkilengthRecommendations(userInfo);
        List<Integer> expected = new ArrayList<>();
        expected.add(200);
        assertEquals(expected,result);
    }

    @Test
    public void whenNotChildFristil_getSkiLengths(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(20);
        userInfo.setHeight(180);
        userInfo.setType(SkiType.FRISTIL);
        List<Integer> result = skiRecommendService.getSkilengthRecommendations(userInfo);
        List<Integer> expected = new ArrayList<>();
        expected.add(190);expected.add(195);
        assertEquals(expected,result);
    }

    @Test
    public void whenChildFristil_getSkiLengths(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(7);
        userInfo.setHeight(125);
        userInfo.setType(SkiType.FRISTIL);
        List<Integer> result = skiRecommendService.getSkilengthRecommendations(userInfo);
        List<Integer> expected = new ArrayList<>();
        expected.add(135);expected.add(140);expected.add(145);
        assertEquals(expected,result);
    }

    @Test
    public void whenChildKlassisk_getSkiLengths(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(6);
        userInfo.setHeight(100);
        userInfo.setType(SkiType.KLASSISK);
        List<Integer> result = skiRecommendService.getSkilengthRecommendations(userInfo);
        List<Integer> expected = new ArrayList<>();
        expected.add(110);expected.add(115);expected.add(120);
        assertEquals(expected,result);
    }
}
