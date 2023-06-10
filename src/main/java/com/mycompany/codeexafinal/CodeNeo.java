/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeexafinal;

/**
 *
 * @author edyfa
 */
public class CodeNeo {
CREATE (Meme:person {name: "Meme"})
CREATE (Ana:person {name: "Ana"})
CREATE (Cris:person {name: "Cris"})
CREATE (Edgar:person {name: "Edgar"})
CREATE (Edi:person {name: "Edi"})
CREATE (Juan:person {name: "Juan"})
CREATE (Maria:person {name: "Maria"})
CREATE (Bob:person {name: "Bob"})
CREATE (Wili:person {name: "Wili"})
CREATE (Joel:person {name: "Joel"})
CREATE (Mercy:person {name: "Mercy"})
CREATE (Clarence:person {name: "Clarence"})
CREATE (Mario:person {name: "Mario"})
CREATE (Jose:person {name: "Jose"})
CREATE (Alan:person {name: "Alan"})


CREATE (Terror:peliculas {name: "Terror"})
CREATE (Accion:peliculas {name: "Accion"})
CREATE (Anime:peliculas {name: "Anime"})
CREATE (Aventura:peliculas {name: "Aventura"})
CREATE (Romantica:peliculas {name: "Romantica"})


CREATE (Meme)-[:FRIENDS]->(Ana)
CREATE (Ana)-[:FRIENDS]->(Edgar)
CREATE (Cris)-[:FRIENDS]->(Edi)
CREATE (Edgar)-[:FRIENDS]->(Edi)
CREATE (Edi)-[:FRIENDS]->(Wili)
CREATE (Juan)-[:FRIENDS]->(Jose)
CREATE (Meme)-[:FRIENDS]->(Edgar)
CREATE (Meme)-[:FRIENDS]->(Cris)
CREATE (Edi)-[:FRIENDS]->(Alan)
CREATE (Ana)-[:FRIENDS]->(Mario)
CREATE (Wili)-[:FRIENDS]->(Edi)
CREATE (Ana)-[:FRIENDS]->(Jose)
CREATE (Edi)-[:FRIENDS]->(Jose)
CREATE (Jose)-[:FRIENDS]->(Alan)
CREATE (Maria)-[:FRIENDS]->(Edi)
CREATE (Mercy)-[:FRIENDS]->(Juan)
CREATE (Juan)-[:FRIENDS]->(Alan)
CREATE (Alan)-[:FRIENDS]->(Clarence)
CREATE (Wili)-[:FRIENDS]->(Jose)
CREATE (Alan)-[:FRIENDS]->(Joel)


CREATE (Meme)-[:Movie]->(Aventura)
CREATE (Ana)-[:Movie]->(Accion)
CREATE (Cris)-[:Movie]->(Terror)
CREATE (Edgar)-[:Movie]->(Romantica)
CREATE (Edi)-[:Movie]->(Anime)
CREATE (Juan)-[:Movie]->(Accion)
CREATE (Maria)-[:Movie]->(Accion)
CREATE (Bob)-[:Movie]->(Terror)
CREATE (Wili)-[:Movie]->(Aventura)
CREATE (Joel)-[:Movie]->(Anime)
CREATE (Mercy)-[:Movie]->(Aventura)
CREATE (Clarence)-[:Movie]->(Anime)
CREATE (Mario)-[:Movie]->(Terror)
CREATE (Jose)-[:Movie]->(Aventura)
CREATE (Alan)-[:Movie]->(Accion)


MATCH (n) RETURN n
}
