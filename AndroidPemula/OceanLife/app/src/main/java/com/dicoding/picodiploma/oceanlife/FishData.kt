package com.dicoding.picodiploma.oceanlife

object FishData {
    private val fishNames = arrayOf("Basking Shark",
            "Blacktip Shark",
            "Blue Shark",
            "Bull Shark",
            "Cookiecutter Shark",
            "Frilled Shark",
            "Goblin Shark",
            "Great Hammerhead Shark",
            "Great White Shark",
            "Greenland Shark",
            "Lemon Shark",
            "Longfin Mako Shark",
            "Longnose Sawshark",
            "Megamouth Shark",
            "Nurse Shark",
            "Oceanic Whitetip Shark",
            "Pacific Angel Shark",
            "Pelagic Thresher Shark")

    private val fishDetails = arrayOf("The basking shark is the second largest fish in the world, and like the largest fish (the whale shark) and the largest animal (the great whales), basking sharks are filter feeders that eat tiny, planktonic prey. Reaching lengths of 40 feet (12 m) and resembling predatory sharks in appearance, the basking shark can give an intimidating impression, but they are quite harmless. They spend most of their time near the surface, swimming with their extraordinarily large mouths open, filtering out their preferred prey, but they may also make deeper, feeding dives.",
            "The blacktip shark is a widespread, medium-sized shark characterized by its black-tipped pectoral, dorsal and tail fins that give this species its name. It is often mistaken for the spinner shark because both species have torpedo-shaped bodies and are known for spinning out of the water while feeding.",
            "Blue sharks are curious, open-ocean predators that live throughout the global ocean, from the tropics to cold temperate waters. They spend most of their lives far from the coast and are truly a pelagic species. The common name comes from the blue color of the skin, unique among the sharks.",
            "The bull shark is a predatory species that lives in coastal seas and is the shark with the best ability to move into freshwaters – particularly large, coastal rivers and lakes. They are able to move back and forth between saltwater and freshwater with ease. This behavior brings them into more contact with humans than most species of sharks, and they are therefore responsible for fatally biting more people than any other species.",
            "The cookiecutter shark is one of the most interesting sharks in the ocean, and it never grows bigger than 18-20 inches (~50 cm). It gets its common name from its feeding strategy of biting off small chunks of much larger animals (see more below). This species is small and lives much of its life in the deep water column (mesopelagic). It is therefore difficult to study, so there is little known about exactly where it lives, but it has been collected or observed in many places around the world, most significantly in tropical to temperate latitudes.",
            "The frilled shark is a strange, prehistoric-looking shark that lives in the open ocean and spends much of its time in deep, dark waters far below the sea surface. Its long, cylindrical body reaches lengths of nearly 7 feet (2 m), and its fins are placed far back on the body. The frilled shark gets its name from the frilly appearance of its gill slits.",
            "The goblin shark is a fascinating species that lives in the open ocean from near the surface down to depths of at least 4265 feet (1300 m). Like many species with a deep-sea affinity, scientists believe goblin sharks only come near the surface at night and spend most of their lives in the dark. The species is noted for its intimidating appearance and its ability to completely unhinge its jaws when feeding.",
            "The great hammerhead shark is the largest of all hammerhead species, reaching a maximum known length of 20 feet (6.1 m)1 and weight of 991 pounds (450 kg).2 The species is distinguished from other hammerheads by its nearly straight hammer-shaped head (cephalofoil) that has a prominent indentation in the middle.",
            "The largest predatory fish in the world – capable of eating marine mammals that weigh several hundred pounds – is the great white shark. The only two fishes that grow larger than Great Whites are the whale shark and the basking shark, both filter feeders that eat plankton.",
            "Reaching lengths of 24 feet (7.3 m) and weights of 2200 pounds (1000 kg), the Greenland shark is one of the largest sharks in the ocean. Though both large and predatory, this species is not known to be particularly aggressive and is thought to be fairly sluggish in the cold waters of the north Atlantic Ocean.",
            "Recognizable by the distinct yellow hue of its skin, the lemon shark occupies coral keys and mangrove forests along the Atlantic Ocean and parts of the Pacific. This shark’s stocky build and other physical features make it a powerful predator underwater, but it is also a common target of commercial fishers looking to sell and trade the shark’s fins and meat. ",
            "The longfin mako shark is named for its particularly long pectoral fins that are as long as or longer than its head. Like its close relative the shortfin mako shark, the longfin mako shark is characterized by its large eyes and long, blade-like teeth that protrude from its mouth.1",
            "The longnose sawshark is one of seven species of sawsharks, noted for their long, flat rostrum (snout) that is covered with several large teeth on its left and right sides giving it the shape of a saw blade. This saw distinguishes sawsharks from all other species of fishes except the sawfishes.",
            "The megamouth shark is a rare shark and a large species, reaching weights of 2700 pounds (1215 kg). However, it is the smallest of the three species of filter-feeding sharks, behind the whale shark and the basking shark. The megamouth shark gets its name from the remarkably large, circular mouth. On an individual approximately 16 feet in length (5 m), the mouth is approximately four feet across (1.3 m). This species has only been observed in the wild a few times, and less than 60 individuals are known by scientists to ever be captured or observed.",
            "The nurse shark is one of the most commonly observed sharks on coral and rocky reefs of the eastern Pacific Ocean and the eastern and western Atlantic Ocean. Given that nurse sharks give live birth and that individuals (even juveniles) have relatively small home ranges, it is surprising that all individuals across this large, tropical to warm temperate distribution are the same species. An extensive genetic study of the nurse shark may reveal the existence of different species in different ocean basins (e.g., on either side of Central America).",
            "The oceanic whitetip shark is one of the most widely ranging sharks, common throughout the warm latitudes of all oceans. It lives in the open ocean, where it is a predator at the top of pelagic food webs. This species gets its common name from the white tips of its dorsal, pectoral, and tail fins. The dorsal and pectoral fins are distinctly rounded rather than pointed like in many other shark species.",
            "The Pacific angel shark is one of 23 angel sharks, noted for their flattened appearance that makes them resemble skates or rays. These flat sharks have broad pectoral fins and relatively large mouths, which they use to create intense negative pressure (suction) when feeding. Though they resemble rays, angel sharks (and other flat sharks) can be easily distinguished from rays by examination of the pectoral fins. In skates and rays, the pectoral fins are always attached to the head. In angel sharks and other flat sharks, that is never the case.",
            "The pelagic thresher shark is one of three thresher sharks, all three known for their extremely long tails. Adult pelagic threshers’ tails are longer than the rest of the body. Scientists believe that they are highly migratory, but there have not been sufficient tagging studies to confirm that suspicion. Little is known about the ecology of pelagic thresher sharks, as they are difficult to study in their natural habitat (the open ocean).")

    private val fishImages = intArrayOf(R.drawable.basking_shark,
    R.drawable.blacktip_shark,
    R.drawable.blue_shark_0,
    R.drawable.bull_shark,
    R.drawable.cookiecutter_shark,
    R.drawable.frilled_shark,
    R.drawable.goblin_shark,
    R.drawable.great_hammerhead_shark,
    R.drawable.great_white_shark,
    R.drawable.greenland_shark,
    R.drawable.lemon_shark,
    R.drawable.longfin_mako_shark,
    R.drawable.longnose_shark,
    R.drawable.megamouth_shark,
    R.drawable.nurse_shark,
    R.drawable.oceanic_whitetip_shark,
    R.drawable.pacific_angel_shark,
    R.drawable.pelagic_thresher_shark)

    val listData: ArrayList<Fish>
        get() {
            val list = arrayListOf<Fish>()
            for (position in fishNames.indices) {
                val fish= Fish()
                fish.name = fishNames[position]
                fish.detail = fishDetails[position]
                fish.photo= fishImages[position]
                list.add(fish)
            }
            return list
        }
}
