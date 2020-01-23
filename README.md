# Animexx JSON API

## Disclaimer

This API is just for the events with few details, not for the full event details. The event details are still written in plain HTML (somebody crazy can parse it maybe).
So if you want the details, you either need to parse their HTML, or just use a WebView.

## Endpoint

The current endpoint for the trip is: 

``https://www.animexx.de/events/ajax/filter``

## Request

A simple GET request works for that. The data could be kinda huge (269 events are listed right now).

## Description

This API has no pagination. You will download the whole data. So you need to build up your pagination by yourself if required.

Probably caching would be a good idea

## Response

The response is mainly an array with some metadata like total responses etc.

A sample data body here:

````````````
{
        "id": 84032,
        "name": "Leipziger Buchmesse 2023",
        "slug": "leipziger-buchmesse-2023",
        "dateStart": {
          "date": "2023-03-23 10:00:00.000000",
          "timezone_type": 1,
          "timezone": "+01:00"
        },
        "dateEnd": {
          "date": "2023-03-26 18:00:00.000000",
          "timezone_type": 1,
          "timezone": "+02:00"
        },
        "address": "Messe-Allee 1",
        "zip": "04356",
        "city": "Leipzig",
        "state": "Sachsen",
        "host": "Leipziger Messe GmbH",
        "contact": "info@leipziger-buchmesse.de",
        "isFeatured": false,
        "hashtags": "",
        "isCancelled": false,
        "duration": 4,
        "attendees": "5000+",
        "website": "http://www.leipziger-buchmesse.de/",
        "intro": "Leipziger Buchmesse 2023",
        "mainImage": null,
        "logoImage": null,
        "isHighlight": true,
        "isPrivate": false,
        "country": "DE",
        "legacyId": 0,
        "isAnimexx": true,
        "animexx": 1,
        "hasGamesroom": false,
        "hasKaraoke": false,
        "hasCatering": false,
        "hasCompetition": false,
        "isPublished": true,
        "isBanned": false,
        "status": 0,
        "created": {
          "date": "2019-11-07 17:42:03.000000",
          "timezone_type": 1,
          "timezone": "+01:00"
        },
        "updated": {
          "date": "2020-01-19 12:46:48.000000",
          "timezone_type": 1,
          "timezone": "+01:00"
        },
        "geoLat": 51.39226,
        "geoLong": 12.37697,
        "geoZoom": 14,
        "geoType": 0,
        "type": {
          "id": 6,
          "title": "Messe / Großveranstaltung",
          "description": null,
          "color": "#63BC96",
          "parent": 1,
          "legacyId": 24
        }
      }
````````````

**DISCLAIMER:** This is just the response body. For serialization you need to go to the **serialization** folder of this repo.

## Serialization

For serialization, I've created some examples at the **serialization** folder of this repo with the help of quicktype.io
