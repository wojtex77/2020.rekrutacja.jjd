package pl.wojciechsiwek;

import java.util.List;

public interface CompositeBlock extends Block{

//    Nie za bardzo rozumiem, dlaczego w tym miejscu jest nagłówek metody getBlocks();
//    Ten interfejs rozszerzając Block winien raczej dodawać nowe cechy dla elementu block a nie zwracać jakąś listę,
//    która nie wiadomo do czego się odnosi. W moim rozwiązaniu ten interfejs wydaje się zbędny.

    List getBlocks();
}
