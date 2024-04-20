package com.codecool.apple.interfaces;

import lombok.*;

/*@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor*/
@RequiredArgsConstructor
//@Data = @Getter @Setter @ToString @EqualsAndHashCode
@Value
public class Coordinates {
    int x;

    @Getter(AccessLevel.PACKAGE)
    @Setter(AccessLevel.NONE)
    int y;

    int y1;

    int y2;
}
