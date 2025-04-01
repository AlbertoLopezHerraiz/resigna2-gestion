package alh.resigna2.gestion.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class MessageUtils {
    private final MessageSource messageSource;

    public String getText(String text){
        return messageSource.getMessage(text, null, Locale.getDefault());
    }
}
