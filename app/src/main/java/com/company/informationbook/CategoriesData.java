package com.company.informationbook;

import java.util.ArrayList;

public class CategoriesData {
    private String tabPlaceholder;
    private int categorySize;
    public ArrayList<String> itemNamesList = new ArrayList<>();
    public ArrayList<Integer> itemImageList = new ArrayList<>();
    public ArrayList<String> itemDescriptionList = new ArrayList<>();

    private void fillCountryArray() {
        itemNamesList.add("Russia");
        itemNamesList.add("Canada");
        itemNamesList.add("China");
        itemNamesList.add("USA");
        itemNamesList.add("Brazil");
        itemNamesList.add("Australia");
        itemNamesList.add("India");
        itemNamesList.add("Argentina");
        itemNamesList.add("Kazakhstan");
        itemNamesList.add("Algeria");

        itemImageList.add(R.drawable.russia);
        itemImageList.add(R.drawable.canada);
        itemImageList.add(R.drawable.china);
        itemImageList.add(R.drawable.usa);
        itemImageList.add(R.drawable.brazil);
        itemImageList.add(R.drawable.australia);
        itemImageList.add(R.drawable.india);
        itemImageList.add(R.drawable.argentina);
        itemImageList.add(R.drawable.kazakhstan);
        itemImageList.add(R.drawable.algeria);

        itemDescriptionList.add("Russia, or the Russian Federation, is a country spanning Eastern Europe and Northern Asia. It is the largest country in the world, covering over 17 million square kilometres (6.6×106 sq mi), and encompassing more than one-eighth of Earth's inhabited land area. Russia extends across eleven time zones, and has the most borders of any country in the world, with sixteen sovereign nations. It has a population of 146.2 million; and is the most populous country in Europe, and the ninth-most populous country in the world. Moscow, the capital, is the largest city in Europe, while Saint Petersburg is the nation's second-largest city and cultural centre. Russians are the largest Slavic and European nation; they speak Russian, the most spoken Slavic language, and the most spoken native language in Europe.");
        itemDescriptionList.add("Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres (3.85 million square miles), making it the world's second-largest country by total area. Its southern and western border with the United States, stretching 8,891 kilometres (5,525 mi), is the world's longest bi-national land border. Canada's capital is Ottawa, and its three largest metropolitan areas are Toronto, Montreal, and Vancouver.");
        itemDescriptionList.add("China, officially the People's Republic of China, is a country in East Asia and unitary one-party socialist republic led by the Communist Party of China (CPC). It is the world's most populous country, with a population of more than 1.4 billion. China follows a single standard time offset of UTC+08:00 even though it spans five geographical time zones and borders 14 countries, the second most of any country in the world after Russia. Covering an area of approximately 9.6 million square kilometers (3.7 million mi2), it is the world's third or fourth largest country. The country is officially divided into 23 provinces,[l] five autonomous regions, and four direct-controlled municipalities of Beijing (the capital city), Tianjin, Shanghai (the largest city), and Chongqing, as well as two special administrative regions: Hong Kong and Macau.");
        itemDescriptionList.add("The United States of America (U.S.A. or USA), commonly known as the United States (U.S. or US) or America, is a country primarily located in North America. It consists of 50 states, a federal district, five major unincorporated territories, 326 Indian reservations, and some minor possessions. At 3.8 million square miles (9.8 million square kilometers), it is the world's third- or fourth-largest country by total area. The United States shares significant land borders with Canada to the north and Mexico to the south, as well as limited maritime borders with the Bahamas, Cuba, and Russia.[22] With a population of more than 331 million people, it is the third most populous country in the world. The national capital is Washington, D.C., and the most populous city is New York City.");
        itemDescriptionList.add("Brazil, officially the Federative Republic of Brazil, is the largest country in both South America and Latin America. It covers an area of 8,515,767 square kilometres (3,287,956 sq mi) with a population of over 211 million. Brazil is the world's fifth-largest and sixth-most populous country, composed of 26 states and the Federal District. It is the largest country to have Portuguese as an official language and the only one in the Americas. Brazil is one of the world's most multicultural and ethnically diverse nations, due to over a century of mass immigration from around the world.[14] It is also the most populous Roman Catholic-majority country, and its capital is Brasília, while the largest city is São Paulo.");
        itemDescriptionList.add("Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. It is the largest country in Oceania and the world's sixth-largest country. Australia's population of nearly 26 million, in an area of 7,617,930 square kilometres (2,941,300 sq mi), is highly urbanised and heavily concentrated on the eastern seaboard. Canberra is the nation's capital, while the largest city is Sydney, and other major metropolitan areas are Melbourne, Brisbane, Perth, and Adelaide.");
        itemDescriptionList.add("India, officially the Republic of India, is a country in South Asia. It is the second-most populous country, the seventh-largest country by land area, and the most populous democracy in the world. Bounded by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the west; China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east. In the Indian Ocean, India is in the vicinity of Sri Lanka and the Maldives; its Andaman and Nicobar Islands share a maritime border with Thailand, Myanmar and Indonesia.");
        itemDescriptionList.add("Argentina, officially the Argentine Republic, is a country in the southern half of South America. It shares the bulk of the Southern Cone with Chile to the west, and is also bordered by Bolivia and Paraguay to the north, Brazil to the northeast, Uruguay and the South Atlantic Ocean to the east, and the Drake Passage to the south. Argentina covers an area of 2,780,400 km2 (1,073,500 sq mi), making it the largest Spanish-speaking nation in the world. It is the second-largest country in South America after Brazil, the fourth-largest country in the Americas, and the eighth-largest country in the world. Argentina is subdivided into twenty-three provinces, and one autonomous city, which is the federal capital and largest city of the nation, Buenos Aires. The provinces and the capital have their own constitutions, but exist under a federal system. Argentina claims sovereignty over a part of Antarctica, the Falkland Islands and South Georgia and the South Sandwich Islands.");
        itemDescriptionList.add("Kazakhstan, officially the Republic of Kazakhstan, is a transcontinental country mainly located in Central Asia with a smaller portion west of the Ural River in Eastern Europe. It covers a land area of 2,724,900 square kilometres (1,052,100 sq mi), and shares land borders with Russia in the north, China in the east, and Kyrgyzstan, Uzbekistan, and Turkmenistan in the south while also adjoining a large part of the Caspian Sea in the southwest. Kazakhstan does not border Mongolia, although they are only 37 kilometers apart, separated by a short portion of the border between Russia and China.");
        itemDescriptionList.add("Algeria, officially the People's Democratic Republic of Algeria, is a country in the Maghreb region of North Africa. It is the largest country by total area in Africa, and by extension, the Arab world, and is bordered to the northeast by Tunisia; to the east by Libya; to the southeast by Niger; to the southwest by Mali, Mauritania, and Western Sahara; to the west by Morocco; and to the north by the Mediterranean Sea. The country has a semi-arid geography, with most of the population living in the fertile north and the Sahara dominating the geography of the south. Algeria covers an area of 2,381,741 square kilometres (919,595 sq mi), with a population of 44 million, and is the ninth-most populous country in Africa. The capital and largest city is Algiers, located in the far north, on the Mediterranean coast.");
    }

    private void fillLeaderArray() {
        itemNamesList.add("Napoleon Bonaparte");
        itemNamesList.add("Alexander the Great");
        itemNamesList.add("Julius Caesar");
        itemNamesList.add("Hannibal Barca");
        itemNamesList.add("Henri de La Tour d’Auvergne");
        itemNamesList.add("Frederick the Great");
        itemNamesList.add("Gustavus Adolphus");
        itemNamesList.add("Prince Eugene of Savoy ");

        itemImageList.add(R.drawable.napoleon_bonaparte);
        itemImageList.add(R.drawable.alexander_the_great);
        itemImageList.add(R.drawable.julius_caesar);
        itemImageList.add(R.drawable.hannibal_barca);
        itemImageList.add(R.drawable.henri_de_la_tour);
        itemImageList.add(R.drawable.frederick_the_great);
        itemImageList.add(R.drawable.gustavus_adolphus);
        itemImageList.add(R.drawable.prince_eugene_of_savoy);

        itemDescriptionList.add("Napoléon Bonaparte (15 August 1769 – 5 May 1821), usually referred to as simply Napoleon in English, was a French military and political leader who rose to prominence during the French Revolution and led several successful campaigns during the Revolutionary Wars. He was the de facto leader of the French Republic as First Consul from 1799 to 1804. As Napoleon I, he was Emperor of the French from 1804 until 1814 and again in 1815. Napoleon dominated European and global affairs for more than a decade while leading France against a series of coalitions in the Napoleonic Wars. He won most of these wars and the vast majority of his battles, building a large empire that ruled over continental Europe before its final collapse in 1815. One of the greatest commanders in history, his wars and campaigns are studied at military schools worldwide. He remains one of the most celebrated and controversial political figures in human history.");
        itemDescriptionList.add("Alexander was king of Macedonia who conquered the Persian empire, invaded India and spread Grecian culture across much of the ancient world.\n" +
                "\n" +
                "Tutored by Aristotle at a young age, he became king after his father, Phillip II, was assassinated.\n" +
                "\n" +
                "While he never officially ranked the seven commanders, Napoleon himself, along with many other historians, seemed to consider Alexander the best.");
        itemDescriptionList.add("Caesar was a Roman general and politician who is one of the greatest conquerors of all time.\n" +
                "\n" +
                "Well known for his victory at the Battle of Alesia and conquest of the Gauls, he was made a consul in the first Roman Triumvarate in 59 BC along with Pompey the Great and Marcus Licinios Crassus.\n" +
                "\n" +
                "But civil war later broke out between Caesar and Pompey. In 48 BC, after suffering a series of defeats to Caesar, Pompey was murdered in Egypt.");
        itemDescriptionList.add("Hannibal was a Carthaginian general and statesman in present day Tunisia who wreaked havoc on the Roman Empire.\n" +
                "\n" +
                "Arguably his greatest conquest came during the Battle of Cannae when he compelled the Romans into attacking in unfavorable conditions, eventually wiping out their cavalry and then its entire army. The Roman historian Polybius wrote that Hannibal's army killed 70,000 Romans.\n" +
                "\n" +
                "Hannibal is also well known for impressively crossing the Alps before entering Italy and the Battle of Cannae, surviving harrowing assaults from the Gauls.\n" +
                "\n" +
                "His power diminished, he poisoned himself around 183 BC.");
        itemDescriptionList.add("Turenne was a French field marshal who served Louis XIV, also known as The Sun King.\n" +
                "\n" +
                "Perhaps his greatest victories came in the winter of 1674 and 1675 during the Franco-Dutch War. In December of 1674, he maneuvered around the German army and surprised them weeks later in early January, hitting the enemy's flanks and driving them away from Alsace.\n" +
                "\n" +
                "He was killed later in July 1675, as the Franco-Dutch War was still raging, by a cannonball as he was observing enemy lines.");
        itemDescriptionList.add("Frederick II, or Frederick the Great, was king of Prussia from 1740-1786 and greatly expanded his kingdom's territory through his military victories.\n" +
                "\n" +
                "Some of his greatest victories were at the battles of Rossbach and Leuthen during the Seven Years War, where he defeated larger armies with great maneuvering.\n" +
                "\n" +
                "But despite being one of Napoleon's seven great commanders, the French commander appeared to consider the next commander even better.");
        itemDescriptionList.add("Gustavus Adolphus was king of Sweden between 1611-1632, and helped put Sweden on the map.\n" +
                "\n" +
                "One of his greatest victories was at the Battle of Breitenfeld during the Thirty Years War when his forces, together with the Saxons, flanked both sides of the Catholic army and annihilated the enemy.\n" +
                "\n" +
                "He was killed during the same war while leading a cavalry charge at the Battle of Lutzen.");
        itemDescriptionList.add("Eugene was a field marshal and statesman under the guise of the House of Savoy, which served the Holy Roman Emperor of Austria.\n" +
                "\n" +
                "Wounded in battle 13 times during his 39 year career, one of Eugene's greatest conquests was the Siege of Belgrade in 1717 against the Ottoman Empire, in which he led a cavalry attack that helped turn the tide.\n" +
                "\n" +
                "\"Military science,\" Napoleon was quoted as saying by Madame de Remusat, \"consists in calculating all the chances accurately in the first place, and then in giving accident exactly, almost mathematically, it's place in one's calculations.\"\n" +
                "\n" +
                "\"Prince Eugene is one of those who understood [this] best,\" Napoleon said.");
    }

    private void fillMuseumArray() {
        itemNamesList.add("Shanghai Astronomy Museum - China");
        itemNamesList.add("Zeitz Museum of Contemporary Art Africa - South Africa");
        itemNamesList.add("V&A Dundee, Scotland");
        itemNamesList.add("Museum Of The Future");
        itemNamesList.add("Guggenheim Museum Bilbao");

        itemImageList.add(R.drawable.shanghai_astronomy_museum);
        itemImageList.add(R.drawable.zeitz_museum);
        itemImageList.add(R.drawable.va_dundee);
        itemImageList.add(R.drawable.museum_of_the_future);
        itemImageList.add(R.drawable.guggenheim_bilbao);

        itemDescriptionList.add("Rounded buildings meant to mimic the stars and planets make up the new Shanghai Museum of Astronomy by Thomas J. Wong and Ennead architecture. A glowing oculus at the entrance tracks the movement of the sun.");
        itemDescriptionList.add("Architect Thomas Heatherwick carved concrete tubes that once held grain into a dazzling lobby at the Zeitz MOCAA, which opened in 2017 in Cape Town, South Africa. The first contemporary art museum in Africa, it showcases works by sculptors, photographers, and painters from across the continent.");
        itemDescriptionList.add("A sister museum to London’s Victoria & Albert Museum, the V&A Dundee opened in 2018 as an outpost for Scottish craft and design. Japanese architect Kengo Kuma used glass and concrete slabs to summon Scotland’s cliffs; an innovative dam holds the river back from the ship-like structure.");
        itemDescriptionList.add("In Dubai, the Museum of the Future is due to open in late 2021 in a fiberglass-and-steel form covered in Arabic calligraphy. It will hold exhibits on design and technology innovations, and the exterior will glow via LED lights at night.");
        itemDescriptionList.add("Frank Gehry’s Guggenheim Bilbao Museum was a game-changer when it opened in 1997 in Spain’s Basque country. Its swooping forms and reflective surface set a new standard for what contemporary museums could look like and how they could transform a city’s identity.");
    }

    private void fillWonderArray() {
        itemNamesList.add("Great Pyramid of Giza");
        itemNamesList.add("Hanging Gardens of Babylon");
        itemNamesList.add("Temple of Artemis at Ephesus");
        itemNamesList.add("Statue of Zeus at Olympia");
        itemNamesList.add("Mausoleum at Halicarnassus");
        itemNamesList.add("Colossus of Rhodes");
        itemNamesList.add("Lighthouse of Alexandria");

        itemImageList.add(R.drawable.great_pyramid_of_giza);
        itemImageList.add(R.drawable.hanging_gardens_of_babylon);
        itemImageList.add(R.drawable.temple_of_artemis_at_ephesus);
        itemImageList.add(R.drawable.statue_of_zeus_at_olympia);
        itemImageList.add(R.drawable.mausoleum_at_halicarnassus);
        itemImageList.add(R.drawable.colossus_of_rhodes);
        itemImageList.add(R.drawable.lighthouse_of_alexandria);

        itemDescriptionList.add("The Great Pyramid of Giza (also known as the Pyramid of Khufu or the Pyramid of Cheops) is the oldest and largest of the pyramids in the Giza pyramid complex bordering present-day Giza in Greater Cairo, Egypt. It is the oldest of the Seven Wonders of the Ancient World, and the only one to remain largely intact.\n" +
                "\n" +
                "Egyptologists conclude that the pyramid was built as a tomb for the Fourth Dynasty Egyptian pharaoh Khufu and estimate that it was built in the 26th century BC during a period of around 27 years.");
        itemDescriptionList.add("The Hanging Gardens of Babylon were one of the Seven Wonders of the Ancient World listed by Hellenic culture. They were described as a remarkable feat of engineering with an ascending series of tiered gardens containing a wide variety of trees, shrubs, and vines, resembling a large green mountain constructed of mud bricks. It was said to have been built in the ancient city of Babylon, near present-day Hillah, Babil province, in Iraq. The Hanging Gardens' name is derived from the Greek word κρεμαστός (kremastós, lit.'overhanging'), which has a broader meaning than the modern English word \"hanging\" and refers to trees being planted on a raised structure such as a terrace.");
        itemDescriptionList.add("The Temple of Artemis or Artemision (Greek: Ἀρτεμίσιον; Turkish: Artemis Tapınağı), also known as the Temple of Diana, was a Greek temple dedicated to an ancient, local form of the goddess Artemis (associated with Diana, a Roman goddess). It was located in Ephesus (near the modern town of Selçuk in present-day Turkey). It was completely rebuilt twice, once after a devastating flood and three hundred years later after an act of arson, and in its final form was one of the Seven Wonders of the Ancient World. By 401 AD it had been ruined or destroyed. Only foundations and fragments of the last temple remain at the site.");
        itemDescriptionList.add("The Statue of Zeus at Olympia was a giant seated figure, about 12.4 m (41 ft) tall,[1] made by the Greek sculptor Phidias around 435 BC at the sanctuary of Olympia, Greece, and erected in the Temple of Zeus there. Zeus is the sky and thunder god in ancient Greek religion, who rules as king of the gods of Mount Olympus.\n" +
                "\n" +
                "The statue was a chryselephantine sculpture of ivory plates and gold panels on a wooden framework. Zeus sat on a painted cedarwood throne ornamented with ebony, ivory, gold and precious stones. It was one of the Seven Wonders of the Ancient World.\n" +
                "\n" +
                "The statue was lost and destroyed during the 5th century AD; details of its form are known only from ancient Greek descriptions and representations on coins.");
        itemDescriptionList.add("The Mausoleum at Halicarnassus or Tomb of Mausolus[a] (Ancient Greek: Μαυσωλεῖον τῆς Ἁλικαρνασσοῦ; Turkish: Halikarnas Mozolesi) was a tomb built between 353 and 350 BC in Halicarnassus (present Bodrum, Turkey) for Mausolus, a native Anatolian from Caria and a satrap in the Achaemenid Empire, and his sister-wife Artemisia II of Caria. The structure was designed by the Greek architects Satyros and Pythius of Priene. Its elevated tomb structure is derived from the tombs of neighbouring Lycia, a territory Mausolus had invaded and annexed circa 360 BC, such as the Nereid Monument.");
        itemDescriptionList.add("The Colossus of Rhodes (Ancient Greek: ὁ Κολοσσὸς Ῥόδιος, romanized: ho Kolossòs Rhódios Greek: Κολοσσός της Ρόδου, romanized: Kolossós tes Rhódou) was a statue of the Greek sun-god Helios, erected in the city of Rhodes, on the Greek island of the same name, by Chares of Lindos in 280 BC. One of the Seven Wonders of the Ancient World, it was constructed to celebrate the successful defence of Rhodes city against an attack by Demetrius Poliorcetes, who had besieged it for a year with a large army and navy. According to most contemporary descriptions, the Colossus stood approximately 70 cubits, or 33 metres (108 feet) high – approximately the height of the modern Statue of Liberty from feet to crown – making it the tallest statue in the ancient world. It collapsed during the earthquake of 226 BC, although parts of it were preserved. In accordance with a certain oracle, the Rhodians did not build it again.[3] John Malalas wrote that Hadrian in his reign re-erected the Colossus,[4] but he was mistaken.[5] According to Suda, the Rhodians were called Colossaeans (Κολοσσαεῖς), because they erected the statue on the island.");
        itemDescriptionList.add("The Lighthouse of Alexandria, sometimes called the Pharos of Alexandria (/ˈfɛərɒs/; Ancient Greek: ὁ Φάρος τῆς Ἀλεξανδρείας, contemporary Koine Greek pronunciation: [ho pʰá.ros tɛ̂ːs a.lek.sandrěːaːs]), was a lighthouse built by the Ptolemaic Kingdom of Ancient Egypt, during the reign of Ptolemy II Philadelphus (280–247 BC). It has been estimated to have been at least 100 metres (330 ft) in overall height. One of the Seven Wonders of the Ancient World, for many centuries it was one of the tallest man-made structures in the world.\n" +
                "\n" +
                "The lighthouse was severely damaged by three earthquakes between 956 AD and 1323 and became an abandoned ruin. It was the third-longest surviving ancient wonder (after the Mausoleum at Halicarnassus and the extant Great Pyramid of Giza), surviving in part until 1480, when the last of its remnant stones were used to build the Citadel of Qaitbay on the site.");
    }

    public String getTabPlaceholder() {
        return tabPlaceholder;
    }

    public int getCategorySize() {
        return categorySize;
    }

    public void startCategory(String key) {
        switch (key) {
            case "The Countries":
                fillCountryArray();
                tabPlaceholder = "Country";
                categorySize = itemNamesList.size();
                break;
            case "The Leaders":
                fillLeaderArray();
                tabPlaceholder = "Leader";
                categorySize = itemNamesList.size();
                break;
            case "The Museums":
                fillMuseumArray();
                tabPlaceholder = "Museum";
                categorySize = itemNamesList.size();
                break;
            default:
                fillWonderArray();
                tabPlaceholder = "Wonder";
                categorySize = itemNamesList.size();
                break;
        }
    }
}
