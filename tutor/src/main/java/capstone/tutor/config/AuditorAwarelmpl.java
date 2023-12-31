package capstone.tutor.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Slf4j
public class AuditorAwarelmpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // 현재 사용자를 가져오는 메소드(인증 정보 확인)
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String userId = "";
        if(authentication != null) {
            userId = authentication.getName();
            log.info("=================>AuditorAwareImpl userId : " + userId);
        }
        return Optional.empty();
    }
}
