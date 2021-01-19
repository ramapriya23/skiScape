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
    //Children age of 0 to 4 -> Ski length same and body height
    if(userInfo.getAge()>0 && userInfo.getAge()<=4){
        recommendedSizes.add((int) Math.round(userInfo.getHeight()));
    }
    //Children age of 5 to 8 -> Ski Lengths range from body length + 10 to body length + 20
        if(userInfo.getAge()>5 && userInfo.getAge()<=8){
            //range of values taken to scrap data from 3rd party website to present in front end
            //not implemented
        for(int i= 10 ;i < 21 ; i=i+5)
                recommendedSizes.add((int) Math.round(userInfo.getHeight()) + i);
    }
        //Length of Ski according to ski type chosen
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
