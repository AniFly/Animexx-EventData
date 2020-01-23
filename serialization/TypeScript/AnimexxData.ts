export interface AnimexxData {
    success: boolean;
    data:    Data;
}

export interface Data {
    events: Event[];
    total:  number;
}

export interface Event {
    id:             number;
    name:           string;
    slug:           string;
    dateStart:      Created;
    dateEnd:        Created;
    address:        null | string;
    zip:            null | string;
    city:           string;
    state:          null | string;
    host:           null | string;
    contact:        string;
    isFeatured:     boolean;
    hashtags:       null | string;
    isCancelled:    boolean;
    duration:       number;
    attendees:      string;
    website:        null | string;
    intro:          string;
    mainImage:      null | string;
    logoImage:      null;
    isHighlight:    boolean;
    isPrivate:      boolean;
    country:        string;
    legacyId:       number;
    isAnimexx:      boolean;
    animexx:        number;
    hasGamesroom:   boolean;
    hasKaraoke:     boolean;
    hasCatering:    boolean;
    hasCompetition: boolean;
    isPublished:    boolean;
    isBanned:       boolean;
    status:         number;
    created:        Created;
    updated:        Created;
    geoLat:         number;
    geoLong:        number;
    geoZoom:        number;
    geoType:        number;
    type:           Type;
}

export interface Created {
    date:          Date;
    timezone_type: number;
    timezone:      string;
}

export interface Type {
    id:          number;
    title:       string;
    description: null;
    color:       string;
    parent:      number;
    legacyId:    number;
}