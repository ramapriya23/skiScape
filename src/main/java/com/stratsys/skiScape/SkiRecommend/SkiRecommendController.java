package com.stratsys.skiScape.SkiRecommend;

import com.stratsys.skiScape.models.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
@Slf4j
public class SkiRecommendController {
    @Autowired
    SkiRecommendService skiRecommendService;

    @RequestMapping(value = "/skiLength", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> getSkiLength(@RequestBody UserInfo userInfo) throws Exception{
        ResponseEntity<List<Integer>> response = null;
        List<Integer> lengths = skiRecommendService.getSkilengthRecommendations(userInfo);
        response = new ResponseEntity<List<Integer>>(lengths , HttpStatus.OK);
    return response;
    }

    @RequestMapping(value ="/something", method = RequestMethod.GET)
    public ResponseEntity<String> getSomething() {
        return new ResponseEntity<String>("HEYYYY" , HttpStatus.OK);

    }
}
