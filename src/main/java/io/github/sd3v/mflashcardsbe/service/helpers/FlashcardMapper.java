package io.github.sd3v.mflashcardsbe.service.helpers;

import io.github.sd3v.mflashcardsbe.domain.Flashcard;
import io.github.sd3v.mflashcardsbe.repository.entity.FlashcardEntity;

public class FlashcardMapper {
  public static FlashcardEntity toEntity(Flashcard domain) {
    // FIXME passing null here
    return new FlashcardEntity(
        domain.id(),
        domain.front(),
        domain.back(),
        domain.example(),
        1l); // TODO check hardcoded deck id
  }

  public static Flashcard toDomain(FlashcardEntity entity) {
    return new Flashcard(entity.id(), entity.front(), entity.back(), entity.example());
  }
}
