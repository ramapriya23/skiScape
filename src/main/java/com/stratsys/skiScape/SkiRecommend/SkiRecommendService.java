package com.stratsys.skiScape.SkiRecommend;

import com.stratsys.skiScape.models.SkiType;
import com.stratsys.skiScape.models.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class SkiRecommendService {
    public List<Integer> getSkilengthRecommendations(UserInfo userInfo) {
    List<Integer> recommendedSizes = new ArrayList<Integer>();
    if(userInfo.getAge()>0 && userInfo.getAge()<=4){
        recommendedSizes.add((int) Math.round(userInfo.getHeight()));
    }
        if(userInfo.getAge()>5 && userInfo.getAge()<=8){
        for(int i= 10 ;i < 21 ; i=i+5)
                recommendedSizes.add((int) Math.round(userInfo.getHeight()) + i);
    }
    if(userInfo.getType() == SkiType.KLASSISK){
        int height = (int) Math.round(userInfo.getHeight()) + 20;
        if(height < 207 && !recommendedSizes.contains(height))
            recommendedSizes.add(height);
        }
        if(userInfo.getType() == SkiType.FRISTIL){
            for(int i= 10 ;i < 16 ; i=i+5) {
                int height = (int) Math.round(userInfo.getHeight()) + i;
                if (!(height < userInfo.getHeight() -10) && !recommendedSizes.contains(height))
                    recommendedSizes.add(height);
            }
        }
    return recommendedSizes;
    }

}
