package org.jobprec.jobpreback.get;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catch")
@RequiredArgsConstructor
public class CatchController {

    private final CatchService catchService;

    @GetMapping("/save")
    public String save(){
        return catchService.save();
    }
}
