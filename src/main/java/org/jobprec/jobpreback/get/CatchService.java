package org.jobprec.jobpreback.get;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CatchService {
    private final CatchRepository catchRepository;
    
    public String save() {
        String message = "Catch : Save Complete";

        Catch aCatch = Catch.builder()
                .message(message)
                .build();

        log.info(message + " ----- " + aCatch.getId());
        log.info("수정 성공");
        catchRepository.save(aCatch);
        return message;
    }
}
