/*
 * This file is generated by jOOQ.
 */
package io.github.sd3v.mflashcardsbe.jooq;


import io.github.sd3v.mflashcardsbe.jooq.tables.Deck;
import io.github.sd3v.mflashcardsbe.jooq.tables.Flashcard;
import io.github.sd3v.mflashcardsbe.jooq.tables.FlywaySchemaHistory;
import io.github.sd3v.mflashcardsbe.jooq.tables.Noun;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.deck</code>.
     */
    public final Deck DECK = Deck.DECK;

    /**
     * The table <code>public.flashcard</code>.
     */
    public final Flashcard FLASHCARD = Flashcard.FLASHCARD;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.noun</code>.
     */
    public final Noun NOUN = Noun.NOUN;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Deck.DECK,
            Flashcard.FLASHCARD,
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Noun.NOUN
        );
    }
}
