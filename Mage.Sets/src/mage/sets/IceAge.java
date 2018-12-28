package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author North
 */
public final class IceAge extends ExpansionSet {

    private static final IceAge instance = new IceAge();

    public static IceAge getInstance() {
        return instance;
    }

    private IceAge() {
        super("Ice Age", "ICE", ExpansionSet.buildDate(1995, 5, 1), SetType.EXPANSION);
        this.blockName = "Ice Age";
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Abyssal Specter", 113, Rarity.UNCOMMON, mage.cards.a.AbyssalSpecter.class));
        cards.add(new SetCardInfo("Adarkar Sentinel", 306, Rarity.UNCOMMON, mage.cards.a.AdarkarSentinel.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 351, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aegis of the Meek", 307, Rarity.RARE, mage.cards.a.AegisOfTheMeek.class));
        cards.add(new SetCardInfo("Altar of Bone", 281, Rarity.RARE, mage.cards.a.AltarOfBone.class));
        cards.add(new SetCardInfo("Anarchy", 170, Rarity.UNCOMMON, mage.cards.a.Anarchy.class));
        cards.add(new SetCardInfo("Arenson's Aura", 3, Rarity.COMMON, mage.cards.a.ArensonsAura.class));
        cards.add(new SetCardInfo("Armor of Faith", 4, Rarity.COMMON, mage.cards.a.ArmorOfFaith.class));
        cards.add(new SetCardInfo("Arnjlot's Ascent", 57, Rarity.COMMON, mage.cards.a.ArnjlotsAscent.class));
        cards.add(new SetCardInfo("Ashen Ghoul", 114, Rarity.UNCOMMON, mage.cards.a.AshenGhoul.class));
        cards.add(new SetCardInfo("Aurochs", 225, Rarity.COMMON, mage.cards.a.Aurochs.class));
        cards.add(new SetCardInfo("Avalanche", 171, Rarity.UNCOMMON, mage.cards.a.Avalanche.class));
        cards.add(new SetCardInfo("Balduvian Barbarians", 172, Rarity.COMMON, mage.cards.b.BalduvianBarbarians.class));
        cards.add(new SetCardInfo("Balduvian Bears", 226, Rarity.COMMON, mage.cards.b.BalduvianBears.class));
        cards.add(new SetCardInfo("Balduvian Conjurer", 58, Rarity.UNCOMMON, mage.cards.b.BalduvianConjurer.class));
        cards.add(new SetCardInfo("Balduvian Hydra", 173, Rarity.RARE, mage.cards.b.BalduvianHydra.class));
        cards.add(new SetCardInfo("Barbed Sextant", 312, Rarity.COMMON, mage.cards.b.BarbedSextant.class));
        cards.add(new SetCardInfo("Baton of Morale", 313, Rarity.UNCOMMON, mage.cards.b.BatonOfMorale.class));
        cards.add(new SetCardInfo("Battle Cry", 5, Rarity.UNCOMMON, mage.cards.b.BattleCry.class));
        cards.add(new SetCardInfo("Battle Frenzy", 175, Rarity.COMMON, mage.cards.b.BattleFrenzy.class));
        cards.add(new SetCardInfo("Binding Grasp", 60, Rarity.UNCOMMON, mage.cards.b.BindingGrasp.class));
        cards.add(new SetCardInfo("Black Scarab", 6, Rarity.UNCOMMON, mage.cards.b.BlackScarab.class));
        cards.add(new SetCardInfo("Blessed Wine", 7, Rarity.COMMON, mage.cards.b.BlessedWine.class));
        cards.add(new SetCardInfo("Blinking Spirit", 8, Rarity.RARE, mage.cards.b.BlinkingSpirit.class));
        cards.add(new SetCardInfo("Blizzard", 227, Rarity.RARE, mage.cards.b.Blizzard.class));
        cards.add(new SetCardInfo("Blue Scarab", 9, Rarity.UNCOMMON, mage.cards.b.BlueScarab.class));
        cards.add(new SetCardInfo("Brainstorm", 61, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Brand of Ill Omen", 177, Rarity.RARE, mage.cards.b.BrandOfIllOmen.class));
        cards.add(new SetCardInfo("Breath of Dreams", 62, Rarity.UNCOMMON, mage.cards.b.BreathOfDreams.class));
        cards.add(new SetCardInfo("Brine Shaman", 115, Rarity.COMMON, mage.cards.b.BrineShaman.class));
        cards.add(new SetCardInfo("Brown Ouphe", 228, Rarity.COMMON, mage.cards.b.BrownOuphe.class));
        cards.add(new SetCardInfo("Brushland", 352, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Burnt Offering", 116, Rarity.COMMON, mage.cards.b.BurntOffering.class));
        cards.add(new SetCardInfo("Call to Arms", 10, Rarity.RARE, mage.cards.c.CallToArms.class));
        cards.add(new SetCardInfo("Caribou Range", 11, Rarity.RARE, mage.cards.c.CaribouRange.class));
        cards.add(new SetCardInfo("Celestial Sword", 314, Rarity.RARE, mage.cards.c.CelestialSword.class));
        cards.add(new SetCardInfo("Centaur Archer", 282, Rarity.UNCOMMON, mage.cards.c.CentaurArcher.class));
        cards.add(new SetCardInfo("Chaos Moon", 179, Rarity.RARE, mage.cards.c.ChaosMoon.class));
        cards.add(new SetCardInfo("Chub Toad", 229, Rarity.COMMON, mage.cards.c.ChubToad.class));
        cards.add(new SetCardInfo("Circle of Protection: Black", 12, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlack.class));
        cards.add(new SetCardInfo("Circle of Protection: Blue", 13, Rarity.COMMON, mage.cards.c.CircleOfProtectionBlue.class));
        cards.add(new SetCardInfo("Circle of Protection: Green", 14, Rarity.COMMON, mage.cards.c.CircleOfProtectionGreen.class));
        cards.add(new SetCardInfo("Circle of Protection: Red", 15, Rarity.COMMON, mage.cards.c.CircleOfProtectionRed.class));
        cards.add(new SetCardInfo("Circle of Protection: White", 16, Rarity.COMMON, mage.cards.c.CircleOfProtectionWhite.class));
        cards.add(new SetCardInfo("Clairvoyance", 63, Rarity.COMMON, mage.cards.c.Clairvoyance.class));
        cards.add(new SetCardInfo("Cloak of Confusion", 117, Rarity.COMMON, mage.cards.c.CloakOfConfusion.class));
        cards.add(new SetCardInfo("Cold Snap", 17, Rarity.UNCOMMON, mage.cards.c.ColdSnap.class));
        cards.add(new SetCardInfo("Conquer", 180, Rarity.UNCOMMON, mage.cards.c.Conquer.class));
        cards.add(new SetCardInfo("Cooperation", 18, Rarity.COMMON, mage.cards.c.Cooperation.class));
        cards.add(new SetCardInfo("Counterspell", 64, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crown of the Ages", 315, Rarity.RARE, mage.cards.c.CrownOfTheAges.class));
        cards.add(new SetCardInfo("Curse of Marit Lage", 181, Rarity.RARE, mage.cards.c.CurseOfMaritLage.class));
        cards.add(new SetCardInfo("Dance of the Dead", 118, Rarity.UNCOMMON, mage.cards.d.DanceOfTheDead.class));
        cards.add(new SetCardInfo("Dark Banishing", 119, Rarity.COMMON, mage.cards.d.DarkBanishing.class));
        cards.add(new SetCardInfo("Dark Ritual", 120, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Death Ward", 19, Rarity.COMMON, mage.cards.d.DeathWard.class));
        cards.add(new SetCardInfo("Deflection", 65, Rarity.RARE, mage.cards.d.Deflection.class));
        cards.add(new SetCardInfo("Demonic Consultation", 121, Rarity.UNCOMMON, mage.cards.d.DemonicConsultation.class));
        cards.add(new SetCardInfo("Despotic Scepter", 316, Rarity.RARE, mage.cards.d.DespoticScepter.class));
        cards.add(new SetCardInfo("Diabolic Vision", 284, Rarity.UNCOMMON, mage.cards.d.DiabolicVision.class));
        cards.add(new SetCardInfo("Dire Wolves", 230, Rarity.COMMON, mage.cards.d.DireWolves.class));
        cards.add(new SetCardInfo("Disenchant", 20, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Dread Wight", 122, Rarity.RARE, mage.cards.d.DreadWight.class));
        cards.add(new SetCardInfo("Dreams of the Dead", 66, Rarity.UNCOMMON, mage.cards.d.DreamsOfTheDead.class));
        cards.add(new SetCardInfo("Drift of the Dead", 123, Rarity.UNCOMMON, mage.cards.d.DriftOfTheDead.class));
        cards.add(new SetCardInfo("Drought", 21, Rarity.UNCOMMON, mage.cards.d.Drought.class));
        cards.add(new SetCardInfo("Dwarven Armory", 182, Rarity.RARE, mage.cards.d.DwarvenArmory.class));
        cards.add(new SetCardInfo("Earthlink", 285, Rarity.RARE, mage.cards.e.Earthlink.class));
        cards.add(new SetCardInfo("Earthlore", 231, Rarity.COMMON, mage.cards.e.Earthlore.class));
        cards.add(new SetCardInfo("Elder Druid", 232, Rarity.RARE, mage.cards.e.ElderDruid.class));
        cards.add(new SetCardInfo("Elemental Augury", 286, Rarity.RARE, mage.cards.e.ElementalAugury.class));
        cards.add(new SetCardInfo("Elkin Bottle", 317, Rarity.RARE, mage.cards.e.ElkinBottle.class));
        cards.add(new SetCardInfo("Enduring Renewal", 23, Rarity.RARE, mage.cards.e.EnduringRenewal.class));
        cards.add(new SetCardInfo("Energy Storm", 24, Rarity.RARE, mage.cards.e.EnergyStorm.class));
        cards.add(new SetCardInfo("Enervate", 67, Rarity.COMMON, mage.cards.e.Enervate.class));
        cards.add(new SetCardInfo("Errantry", 183, Rarity.COMMON, mage.cards.e.Errantry.class));
        cards.add(new SetCardInfo("Essence Filter", 233, Rarity.COMMON, mage.cards.e.EssenceFilter.class));
        cards.add(new SetCardInfo("Essence Flare", 69, Rarity.COMMON, mage.cards.e.EssenceFlare.class));
        cards.add(new SetCardInfo("Fanatical Fever", 234, Rarity.UNCOMMON, mage.cards.f.FanaticalFever.class));
        cards.add(new SetCardInfo("Fear", 124, Rarity.COMMON, mage.cards.f.Fear.class));
        cards.add(new SetCardInfo("Fiery Justice", 288, Rarity.RARE, mage.cards.f.FieryJustice.class));
        cards.add(new SetCardInfo("Fire Covenant", 289, Rarity.UNCOMMON, mage.cards.f.FireCovenant.class));
        cards.add(new SetCardInfo("Flame Spirit", 184, Rarity.UNCOMMON, mage.cards.f.FlameSpirit.class));
        cards.add(new SetCardInfo("Flare", 185, Rarity.COMMON, mage.cards.f.Flare.class));
        cards.add(new SetCardInfo("Flooded Woodlands", 290, Rarity.RARE, mage.cards.f.FloodedWoodlands.class));
        cards.add(new SetCardInfo("Flow of Maggots", 125, Rarity.RARE, mage.cards.f.FlowOfMaggots.class));
        cards.add(new SetCardInfo("Folk of the Pines", 235, Rarity.COMMON, mage.cards.f.FolkOfThePines.class));
        cards.add(new SetCardInfo("Forbidden Lore", 236, Rarity.RARE, mage.cards.f.ForbiddenLore.class));
        cards.add(new SetCardInfo("Force Void", 70, Rarity.UNCOMMON, mage.cards.f.ForceVoid.class));
        cards.add(new SetCardInfo("Forest", 380, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 381, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 382, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Lore", 237, Rarity.UNCOMMON, mage.cards.f.ForgottenLore.class));
        cards.add(new SetCardInfo("Formation", 25, Rarity.RARE, mage.cards.f.Formation.class));
        cards.add(new SetCardInfo("Foul Familiar", 126, Rarity.COMMON, mage.cards.f.FoulFamiliar.class));
        cards.add(new SetCardInfo("Foxfire", 238, Rarity.COMMON, mage.cards.f.Foxfire.class));
        cards.add(new SetCardInfo("Freyalise's Charm", 240, Rarity.UNCOMMON, mage.cards.f.FreyalisesCharm.class));
        cards.add(new SetCardInfo("Fumarole", 291, Rarity.UNCOMMON, mage.cards.f.Fumarole.class));
        cards.add(new SetCardInfo("Fyndhorn Bow", 318, Rarity.UNCOMMON, mage.cards.f.FyndhornBow.class));
        cards.add(new SetCardInfo("Fyndhorn Brownie", 242, Rarity.COMMON, mage.cards.f.FyndhornBrownie.class));
        cards.add(new SetCardInfo("Fyndhorn Elder", 243, Rarity.UNCOMMON, mage.cards.f.FyndhornElder.class));
        cards.add(new SetCardInfo("Fyndhorn Elves", 244, Rarity.COMMON, mage.cards.f.FyndhornElves.class));
        cards.add(new SetCardInfo("Fyndhorn Pollen", 245, Rarity.RARE, mage.cards.f.FyndhornPollen.class));
        cards.add(new SetCardInfo("Game of Chaos", 186, Rarity.RARE, mage.cards.g.GameOfChaos.class));
        cards.add(new SetCardInfo("Gangrenous Zombies", 127, Rarity.COMMON, mage.cards.g.GangrenousZombies.class));
        cards.add(new SetCardInfo("Gaze of Pain", 128, Rarity.COMMON, mage.cards.g.GazeOfPain.class));
        cards.add(new SetCardInfo("General Jarkeld", 27, Rarity.RARE, mage.cards.g.GeneralJarkeld.class));
        cards.add(new SetCardInfo("Giant Growth", 246, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Trap Door Spider", 293, Rarity.UNCOMMON, mage.cards.g.GiantTrapDoorSpider.class));
        cards.add(new SetCardInfo("Glacial Chasm", 353, Rarity.UNCOMMON, mage.cards.g.GlacialChasm.class));
        cards.add(new SetCardInfo("Glacial Crevasses", 187, Rarity.RARE, mage.cards.g.GlacialCrevasses.class));
        cards.add(new SetCardInfo("Glacial Wall", 71, Rarity.UNCOMMON, mage.cards.g.GlacialWall.class));
        cards.add(new SetCardInfo("Goblin Lyre", 319, Rarity.RARE, mage.cards.g.GoblinLyre.class));
        cards.add(new SetCardInfo("Goblin Mutant", 188, Rarity.UNCOMMON, mage.cards.g.GoblinMutant.class));
        cards.add(new SetCardInfo("Goblin Snowman", 191, Rarity.UNCOMMON, mage.cards.g.GoblinSnowman.class));
        cards.add(new SetCardInfo("Gorilla Pack", 247, Rarity.COMMON, mage.cards.g.GorillaPack.class));
        cards.add(new SetCardInfo("Gravebind", 129, Rarity.RARE, mage.cards.g.Gravebind.class));
        cards.add(new SetCardInfo("Green Scarab", 28, Rarity.UNCOMMON, mage.cards.g.GreenScarab.class));
        cards.add(new SetCardInfo("Hallowed Ground", 29, Rarity.UNCOMMON, mage.cards.h.HallowedGround.class));
        cards.add(new SetCardInfo("Halls of Mist", 354, Rarity.RARE, mage.cards.h.HallsOfMist.class));
        cards.add(new SetCardInfo("Heal", 30, Rarity.COMMON, mage.cards.h.Heal.class));
        cards.add(new SetCardInfo("Hecatomb", 130, Rarity.RARE, mage.cards.h.Hecatomb.class));
        cards.add(new SetCardInfo("Hematite Talisman", 320, Rarity.UNCOMMON, mage.cards.h.HematiteTalisman.class));
        cards.add(new SetCardInfo("Hoar Shade", 131, Rarity.COMMON, mage.cards.h.HoarShade.class));
        cards.add(new SetCardInfo("Hot Springs", 248, Rarity.RARE, mage.cards.h.HotSprings.class));
        cards.add(new SetCardInfo("Howl from Beyond", 132, Rarity.COMMON, mage.cards.h.HowlFromBeyond.class));
        cards.add(new SetCardInfo("Hurricane", 249, Rarity.UNCOMMON, mage.cards.h.Hurricane.class));
        cards.add(new SetCardInfo("Hyalopterous Lemure", 133, Rarity.UNCOMMON, mage.cards.h.HyalopterousLemure.class));
        cards.add(new SetCardInfo("Hydroblast", 72, Rarity.COMMON, mage.cards.h.Hydroblast.class));
        cards.add(new SetCardInfo("Hymn of Rebirth", 295, Rarity.UNCOMMON, mage.cards.h.HymnOfRebirth.class));
        cards.add(new SetCardInfo("Ice Cauldron", 321, Rarity.RARE, mage.cards.i.IceCauldron.class));
        cards.add(new SetCardInfo("Ice Floe", 355, Rarity.UNCOMMON, mage.cards.i.IceFloe.class));
        cards.add(new SetCardInfo("Iceberg", 73, Rarity.UNCOMMON, mage.cards.i.Iceberg.class));
        cards.add(new SetCardInfo("Icequake", 134, Rarity.UNCOMMON, mage.cards.i.Icequake.class));
        cards.add(new SetCardInfo("Icy Manipulator", 322, Rarity.UNCOMMON, mage.cards.i.IcyManipulator.class));
        cards.add(new SetCardInfo("Icy Prison", 74, Rarity.RARE, mage.cards.i.IcyPrison.class));
        cards.add(new SetCardInfo("Illusionary Forces", 75, Rarity.COMMON, mage.cards.i.IllusionaryForces.class));
        cards.add(new SetCardInfo("Illusionary Wall", 78, Rarity.COMMON, mage.cards.i.IllusionaryWall.class));
        cards.add(new SetCardInfo("Illusions of Grandeur", 79, Rarity.RARE, mage.cards.i.IllusionsOfGrandeur.class));
        cards.add(new SetCardInfo("Imposing Visage", 193, Rarity.COMMON, mage.cards.i.ImposingVisage.class));
        cards.add(new SetCardInfo("Incinerate", 194, Rarity.COMMON, mage.cards.i.Incinerate.class));
        cards.add(new SetCardInfo("Infernal Darkness", 135, Rarity.RARE, mage.cards.i.InfernalDarkness.class));
        cards.add(new SetCardInfo("Infernal Denizen", 136, Rarity.RARE, mage.cards.i.InfernalDenizen.class));
        cards.add(new SetCardInfo("Infinite Hourglass", 323, Rarity.RARE, mage.cards.i.InfiniteHourglass.class));
        cards.add(new SetCardInfo("Infuse", 80, Rarity.COMMON, mage.cards.i.Infuse.class));
        cards.add(new SetCardInfo("Island", 368, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 369, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 370, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jester's Cap", 324, Rarity.RARE, mage.cards.j.JestersCap.class));
        cards.add(new SetCardInfo("Jester's Mask", 325, Rarity.RARE, mage.cards.j.JestersMask.class));
        cards.add(new SetCardInfo("Jeweled Amulet", 326, Rarity.UNCOMMON, mage.cards.j.JeweledAmulet.class));
        cards.add(new SetCardInfo("Johtull Wurm", 250, Rarity.UNCOMMON, mage.cards.j.JohtullWurm.class));
        cards.add(new SetCardInfo("Jokulhaups", 195, Rarity.RARE, mage.cards.j.Jokulhaups.class));
        cards.add(new SetCardInfo("Juniper Order Druid", 251, Rarity.COMMON, mage.cards.j.JuniperOrderDruid.class));
        cards.add(new SetCardInfo("Justice", 32, Rarity.UNCOMMON, mage.cards.j.Justice.class));
        cards.add(new SetCardInfo("Karplusan Forest", 356, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Karplusan Giant", 196, Rarity.UNCOMMON, mage.cards.k.KarplusanGiant.class));
        cards.add(new SetCardInfo("Karplusan Yeti", 197, Rarity.RARE, mage.cards.k.KarplusanYeti.class));
        cards.add(new SetCardInfo("Kelsinko Ranger", 33, Rarity.COMMON, mage.cards.k.KelsinkoRanger.class));
        cards.add(new SetCardInfo("Kjeldoran Dead", 137, Rarity.COMMON, mage.cards.k.KjeldoranDead.class));
        cards.add(new SetCardInfo("Kjeldoran Frostbeast", 296, Rarity.UNCOMMON, mage.cards.k.KjeldoranFrostbeast.class));
        cards.add(new SetCardInfo("Kjeldoran Knight", 36, Rarity.RARE, mage.cards.k.KjeldoranKnight.class));
        cards.add(new SetCardInfo("Kjeldoran Phalanx", 37, Rarity.RARE, mage.cards.k.KjeldoranPhalanx.class));
        cards.add(new SetCardInfo("Kjeldoran Royal Guard", 38, Rarity.RARE, mage.cards.k.KjeldoranRoyalGuard.class));
        cards.add(new SetCardInfo("Kjeldoran Skycaptain", 39, Rarity.UNCOMMON, mage.cards.k.KjeldoranSkycaptain.class));
        cards.add(new SetCardInfo("Kjeldoran Skyknight", 40, Rarity.COMMON, mage.cards.k.KjeldoranSkyknight.class));
        cards.add(new SetCardInfo("Kjeldoran Warrior", 41, Rarity.COMMON, mage.cards.k.KjeldoranWarrior.class));
        cards.add(new SetCardInfo("Knight of Stromgald", 138, Rarity.UNCOMMON, mage.cards.k.KnightOfStromgald.class));
        cards.add(new SetCardInfo("Krovikan Elementalist", 139, Rarity.UNCOMMON, mage.cards.k.KrovikanElementalist.class));
        cards.add(new SetCardInfo("Krovikan Fetish", 140, Rarity.COMMON, mage.cards.k.KrovikanFetish.class));
        cards.add(new SetCardInfo("Krovikan Sorcerer", 81, Rarity.COMMON, mage.cards.k.KrovikanSorcerer.class));
        cards.add(new SetCardInfo("Krovikan Vampire", 141, Rarity.UNCOMMON, mage.cards.k.KrovikanVampire.class));
        cards.add(new SetCardInfo("Land Cap", 357, Rarity.RARE, mage.cards.l.LandCap.class));
        cards.add(new SetCardInfo("Lapis Lazuli Talisman", 327, Rarity.UNCOMMON, mage.cards.l.LapisLazuliTalisman.class));
        cards.add(new SetCardInfo("Lava Tubes", 358, Rarity.RARE, mage.cards.l.LavaTubes.class));
        cards.add(new SetCardInfo("Legions of Lim-Dul", 142, Rarity.COMMON, mage.cards.l.LegionsOfLimDul.class));
        cards.add(new SetCardInfo("Leshrac's Rite", 143, Rarity.UNCOMMON, mage.cards.l.LeshracsRite.class));
        cards.add(new SetCardInfo("Leshrac's Sigil", 144, Rarity.UNCOMMON, mage.cards.l.LeshracsSigil.class));
        cards.add(new SetCardInfo("Lhurgoyf", 252, Rarity.RARE, mage.cards.l.Lhurgoyf.class));
        cards.add(new SetCardInfo("Lightning Blow", 42, Rarity.RARE, mage.cards.l.LightningBlow.class));
        cards.add(new SetCardInfo("Lim-Dul's Hex", 146, Rarity.UNCOMMON, mage.cards.l.LimDulsHex.class));
        cards.add(new SetCardInfo("Lure", 253, Rarity.UNCOMMON, mage.cards.l.Lure.class));
        cards.add(new SetCardInfo("Magus of the Unseen", 82, Rarity.RARE, mage.cards.m.MagusOfTheUnseen.class));
        cards.add(new SetCardInfo("Malachite Talisman", 328, Rarity.UNCOMMON, mage.cards.m.MalachiteTalisman.class));
        cards.add(new SetCardInfo("Marton Stromgald", 199, Rarity.RARE, mage.cards.m.MartonStromgald.class));
        cards.add(new SetCardInfo("Melee", 200, Rarity.UNCOMMON, mage.cards.m.Melee.class));
        cards.add(new SetCardInfo("Melting", 201, Rarity.UNCOMMON, mage.cards.m.Melting.class));
        cards.add(new SetCardInfo("Merieke Ri Berit", 297, Rarity.RARE, mage.cards.m.MeriekeRiBerit.class));
        cards.add(new SetCardInfo("Mesmeric Trance", 83, Rarity.RARE, mage.cards.m.MesmericTrance.class));
        cards.add(new SetCardInfo("Meteor Shower", 202, Rarity.COMMON, mage.cards.m.MeteorShower.class));
        cards.add(new SetCardInfo("Mind Ravel", 147, Rarity.COMMON, mage.cards.m.MindRavel.class));
        cards.add(new SetCardInfo("Mind Warp", 148, Rarity.UNCOMMON, mage.cards.m.MindWarp.class));
        cards.add(new SetCardInfo("Minion of Leshrac", 150, Rarity.RARE, mage.cards.m.MinionOfLeshrac.class));
        cards.add(new SetCardInfo("Minion of Tevesh Szat", 151, Rarity.RARE, mage.cards.m.MinionOfTeveshSzat.class));
        cards.add(new SetCardInfo("Mistfolk", 84, Rarity.COMMON, mage.cards.m.Mistfolk.class));
        cards.add(new SetCardInfo("Mole Worms", 152, Rarity.UNCOMMON, mage.cards.m.MoleWorms.class));
        cards.add(new SetCardInfo("Monsoon", 298, Rarity.RARE, mage.cards.m.Monsoon.class));
        cards.add(new SetCardInfo("Moor Fiend", 153, Rarity.COMMON, mage.cards.m.MoorFiend.class));
        cards.add(new SetCardInfo("Mountain Goat", 203, Rarity.COMMON, mage.cards.m.MountainGoat.class));
        cards.add(new SetCardInfo("Mountain Titan", 299, Rarity.RARE, mage.cards.m.MountainTitan.class));
        cards.add(new SetCardInfo("Mountain", 376, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 377, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 378, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mudslide", 204, Rarity.RARE, mage.cards.m.Mudslide.class));
        cards.add(new SetCardInfo("Mystic Might", 86, Rarity.RARE, mage.cards.m.MysticMight.class));
        cards.add(new SetCardInfo("Mystic Remora", 87, Rarity.COMMON, mage.cards.m.MysticRemora.class));
        cards.add(new SetCardInfo("Nacre Talisman", 329, Rarity.UNCOMMON, mage.cards.n.NacreTalisman.class));
        cards.add(new SetCardInfo("Naked Singularity", 330, Rarity.RARE, mage.cards.n.NakedSingularity.class));
        cards.add(new SetCardInfo("Nature's Lore", 255, Rarity.UNCOMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Necropotence", 154, Rarity.RARE, mage.cards.n.Necropotence.class));
        cards.add(new SetCardInfo("Norritt", 155, Rarity.COMMON, mage.cards.n.Norritt.class));
        cards.add(new SetCardInfo("Onyx Talisman", 331, Rarity.UNCOMMON, mage.cards.o.OnyxTalisman.class));
        cards.add(new SetCardInfo("Orcish Cannoneers", 205, Rarity.UNCOMMON, mage.cards.o.OrcishCannoneers.class));
        cards.add(new SetCardInfo("Orcish Healer", 208, Rarity.UNCOMMON, mage.cards.o.OrcishHealer.class));
        cards.add(new SetCardInfo("Orcish Librarian", 209, Rarity.RARE, mage.cards.o.OrcishLibrarian.class));
        cards.add(new SetCardInfo("Orcish Lumberjack", 210, Rarity.COMMON, mage.cards.o.OrcishLumberjack.class));
        cards.add(new SetCardInfo("Orcish Squatters", 211, Rarity.RARE, mage.cards.o.OrcishSquatters.class));
        cards.add(new SetCardInfo("Order of the Sacred Torch", 45, Rarity.RARE, mage.cards.o.OrderOfTheSacredTorch.class));
        cards.add(new SetCardInfo("Order of the White Shield", 46, Rarity.UNCOMMON, mage.cards.o.OrderOfTheWhiteShield.class));
        cards.add(new SetCardInfo("Pale Bears", 256, Rarity.RARE, mage.cards.p.PaleBears.class));
        cards.add(new SetCardInfo("Panic", 212, Rarity.COMMON, mage.cards.p.Panic.class));
        cards.add(new SetCardInfo("Pentagram of the Ages", 332, Rarity.RARE, mage.cards.p.PentagramOfTheAges.class));
        cards.add(new SetCardInfo("Pestilence Rats", 157, Rarity.COMMON, mage.cards.p.PestilenceRats.class));
        cards.add(new SetCardInfo("Pit Trap", 333, Rarity.UNCOMMON, mage.cards.p.PitTrap.class));
        cards.add(new SetCardInfo("Plains", 364, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 365, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 366, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Polar Kraken", 89, Rarity.RARE, mage.cards.p.PolarKraken.class));
        cards.add(new SetCardInfo("Portent", 90, Rarity.COMMON, mage.cards.p.Portent.class));
        cards.add(new SetCardInfo("Power Sink", 91, Rarity.COMMON, mage.cards.p.PowerSink.class));
        cards.add(new SetCardInfo("Pox", 158, Rarity.RARE, mage.cards.p.Pox.class));
        cards.add(new SetCardInfo("Prismatic Ward", 47, Rarity.COMMON, mage.cards.p.PrismaticWard.class));
        cards.add(new SetCardInfo("Pygmy Allosaurus", 257, Rarity.RARE, mage.cards.p.PygmyAllosaurus.class));
        cards.add(new SetCardInfo("Pyknite", 258, Rarity.COMMON, mage.cards.p.Pyknite.class));
        cards.add(new SetCardInfo("Pyroblast", 213, Rarity.COMMON, mage.cards.p.Pyroblast.class));
        cards.add(new SetCardInfo("Pyroclasm", 214, Rarity.UNCOMMON, mage.cards.p.Pyroclasm.class));
        cards.add(new SetCardInfo("Rally", 48, Rarity.COMMON, mage.cards.r.Rally.class));
        cards.add(new SetCardInfo("Ray of Command", 92, Rarity.COMMON, mage.cards.r.RayOfCommand.class));
        cards.add(new SetCardInfo("Ray of Erasure", 93, Rarity.COMMON, mage.cards.r.RayOfErasure.class));
        cards.add(new SetCardInfo("Reality Twist", 94, Rarity.RARE, mage.cards.r.RealityTwist.class));
        cards.add(new SetCardInfo("Reclamation", 300, Rarity.RARE, mage.cards.r.Reclamation.class));
        cards.add(new SetCardInfo("Red Scarab", 49, Rarity.UNCOMMON, mage.cards.r.RedScarab.class));
        cards.add(new SetCardInfo("Regeneration", 259, Rarity.COMMON, mage.cards.r.Regeneration.class));
        cards.add(new SetCardInfo("Rime Dryad", 260, Rarity.COMMON, mage.cards.r.RimeDryad.class));
        cards.add(new SetCardInfo("Ritual of Subdual", 261, Rarity.RARE, mage.cards.r.RitualOfSubdual.class));
        cards.add(new SetCardInfo("River Delta", 359, Rarity.RARE, mage.cards.r.RiverDelta.class));
        cards.add(new SetCardInfo("Runed Arch", 334, Rarity.RARE, mage.cards.r.RunedArch.class));
        cards.add(new SetCardInfo("Sabretooth Tiger", 215, Rarity.COMMON, mage.cards.s.SabretoothTiger.class));
        cards.add(new SetCardInfo("Scaled Wurm", 262, Rarity.COMMON, mage.cards.s.ScaledWurm.class));
        cards.add(new SetCardInfo("Sea Spirit", 95, Rarity.UNCOMMON, mage.cards.s.SeaSpirit.class));
        cards.add(new SetCardInfo("Seizures", 159, Rarity.COMMON, mage.cards.s.Seizures.class));
        cards.add(new SetCardInfo("Shambling Strider", 263, Rarity.COMMON, mage.cards.s.ShamblingStrider.class));
        cards.add(new SetCardInfo("Shatter", 216, Rarity.COMMON, mage.cards.s.Shatter.class));
        cards.add(new SetCardInfo("Shield Bearer", 52, Rarity.COMMON, mage.cards.s.ShieldBearer.class));
        cards.add(new SetCardInfo("Shield of the Ages", 335, Rarity.UNCOMMON, mage.cards.s.ShieldOfTheAges.class));
        cards.add(new SetCardInfo("Shyft", 96, Rarity.RARE, mage.cards.s.Shyft.class));
        cards.add(new SetCardInfo("Sibilant Spirit", 97, Rarity.RARE, mage.cards.s.SibilantSpirit.class));
        cards.add(new SetCardInfo("Silver Erne", 98, Rarity.UNCOMMON, mage.cards.s.SilverErne.class));
        cards.add(new SetCardInfo("Skeleton Ship", 301, Rarity.RARE, mage.cards.s.SkeletonShip.class));
        cards.add(new SetCardInfo("Skull Catapult", 336, Rarity.UNCOMMON, mage.cards.s.SkullCatapult.class));
        cards.add(new SetCardInfo("Snow Fortress", 337, Rarity.RARE, mage.cards.s.SnowFortress.class));
        cards.add(new SetCardInfo("Snow Hound", 53, Rarity.UNCOMMON, mage.cards.s.SnowHound.class));
        cards.add(new SetCardInfo("Snow-Covered Forest", 383, Rarity.LAND, mage.cards.s.SnowCoveredForest.class));
        cards.add(new SetCardInfo("Snow-Covered Island", 371, Rarity.LAND, mage.cards.s.SnowCoveredIsland.class));
        cards.add(new SetCardInfo("Snow-Covered Mountain", 379, Rarity.LAND, mage.cards.s.SnowCoveredMountain.class));
        cards.add(new SetCardInfo("Snow-Covered Plains", 367, Rarity.LAND, mage.cards.s.SnowCoveredPlains.class));
        cards.add(new SetCardInfo("Snow-Covered Swamp", 372, Rarity.LAND, mage.cards.s.SnowCoveredSwamp.class));
        cards.add(new SetCardInfo("Soldevi Golem", 338, Rarity.RARE, mage.cards.s.SoldeviGolem.class));
        cards.add(new SetCardInfo("Soldevi Machinist", 102, Rarity.UNCOMMON, mage.cards.s.SoldeviMachinist.class));
        cards.add(new SetCardInfo("Soldevi Simulacrum", 339, Rarity.UNCOMMON, mage.cards.s.SoldeviSimulacrum.class));
        cards.add(new SetCardInfo("Songs of the Damned", 160, Rarity.COMMON, mage.cards.s.SongsOfTheDamned.class));
        cards.add(new SetCardInfo("Soul Barrier", 103, Rarity.UNCOMMON, mage.cards.s.SoulBarrier.class));
        cards.add(new SetCardInfo("Soul Burn", 161, Rarity.COMMON, mage.cards.s.SoulBurn.class));
        cards.add(new SetCardInfo("Soul Kiss", 162, Rarity.COMMON, mage.cards.s.SoulKiss.class));
        cards.add(new SetCardInfo("Spoils of Evil", 163, Rarity.RARE, mage.cards.s.SpoilsOfEvil.class));
        cards.add(new SetCardInfo("Staff of the Ages", 340, Rarity.RARE, mage.cards.s.StaffOfTheAges.class));
        cards.add(new SetCardInfo("Stampede", 265, Rarity.RARE, mage.cards.s.Stampede.class));
        cards.add(new SetCardInfo("Stone Rain", 217, Rarity.COMMON, mage.cards.s.StoneRain.class));
        cards.add(new SetCardInfo("Stone Spirit", 218, Rarity.UNCOMMON, mage.cards.s.StoneSpirit.class));
        cards.add(new SetCardInfo("Stonehands", 219, Rarity.COMMON, mage.cards.s.Stonehands.class));
        cards.add(new SetCardInfo("Storm Spirit", 303, Rarity.RARE, mage.cards.s.StormSpirit.class));
        cards.add(new SetCardInfo("Stormbind", 304, Rarity.RARE, mage.cards.s.Stormbind.class));
        cards.add(new SetCardInfo("Stromgald Cabal", 166, Rarity.RARE, mage.cards.s.StromgaldCabal.class));
        cards.add(new SetCardInfo("Stunted Growth", 266, Rarity.RARE, mage.cards.s.StuntedGrowth.class));
        cards.add(new SetCardInfo("Sulfurous Springs", 360, Rarity.RARE, mage.cards.s.SulfurousSprings.class));
        cards.add(new SetCardInfo("Sunstone", 341, Rarity.UNCOMMON, mage.cards.s.Sunstone.class));
        cards.add(new SetCardInfo("Swamp", 373, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 374, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 375, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swords to Plowshares", 54, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Tarpan", 267, Rarity.COMMON, mage.cards.t.Tarpan.class));
        cards.add(new SetCardInfo("Thermokarst", 268, Rarity.UNCOMMON, mage.cards.t.Thermokarst.class));
        cards.add(new SetCardInfo("Thoughtleech", 269, Rarity.UNCOMMON, mage.cards.t.Thoughtleech.class));
        cards.add(new SetCardInfo("Thunder Wall", 104, Rarity.UNCOMMON, mage.cards.t.ThunderWall.class));
        cards.add(new SetCardInfo("Timberline Ridge", 361, Rarity.RARE, mage.cards.t.TimberlineRidge.class));
        cards.add(new SetCardInfo("Time Bomb", 342, Rarity.RARE, mage.cards.t.TimeBomb.class));
        cards.add(new SetCardInfo("Tinder Wall", 270, Rarity.COMMON, mage.cards.t.TinderWall.class));
        cards.add(new SetCardInfo("Tor Giant", 220, Rarity.COMMON, mage.cards.t.TorGiant.class));
        cards.add(new SetCardInfo("Total War", 221, Rarity.RARE, mage.cards.t.TotalWar.class));
        cards.add(new SetCardInfo("Touch of Death", 167, Rarity.COMMON, mage.cards.t.TouchOfDeath.class));
        cards.add(new SetCardInfo("Trailblazer", 272, Rarity.RARE, mage.cards.t.Trailblazer.class));
        cards.add(new SetCardInfo("Underground River", 362, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Updraft", 105, Rarity.UNCOMMON, mage.cards.u.Updraft.class));
        cards.add(new SetCardInfo("Urza's Bauble", 343, Rarity.UNCOMMON, mage.cards.u.UrzasBauble.class));
        cards.add(new SetCardInfo("Veldt", 363, Rarity.RARE, mage.cards.v.Veldt.class));
        cards.add(new SetCardInfo("Venomous Breath", 273, Rarity.UNCOMMON, mage.cards.v.VenomousBreath.class));
        cards.add(new SetCardInfo("Vertigo", 222, Rarity.UNCOMMON, mage.cards.v.Vertigo.class));
        cards.add(new SetCardInfo("Vexing Arcanix", 344, Rarity.RARE, mage.cards.v.VexingArcanix.class));
        cards.add(new SetCardInfo("Vibrating Sphere", 345, Rarity.RARE, mage.cards.v.VibratingSphere.class));
        cards.add(new SetCardInfo("Walking Wall", 346, Rarity.UNCOMMON, mage.cards.w.WalkingWall.class));
        cards.add(new SetCardInfo("Wall of Lava", 223, Rarity.UNCOMMON, mage.cards.w.WallOfLava.class));
        cards.add(new SetCardInfo("Wall of Pine Needles", 274, Rarity.UNCOMMON, mage.cards.w.WallOfPineNeedles.class));
        cards.add(new SetCardInfo("Wall of Shields", 347, Rarity.UNCOMMON, mage.cards.w.WallOfShields.class));
        cards.add(new SetCardInfo("War Chariot", 348, Rarity.UNCOMMON, mage.cards.w.WarChariot.class));
        cards.add(new SetCardInfo("Warning", 55, Rarity.COMMON, mage.cards.w.Warning.class));
        cards.add(new SetCardInfo("Whalebone Glider", 349, Rarity.UNCOMMON, mage.cards.w.WhaleboneGlider.class));
        cards.add(new SetCardInfo("White Scarab", 56, Rarity.UNCOMMON, mage.cards.w.WhiteScarab.class));
        cards.add(new SetCardInfo("Whiteout", 275, Rarity.UNCOMMON, mage.cards.w.Whiteout.class));
        cards.add(new SetCardInfo("Wild Growth", 277, Rarity.COMMON, mage.cards.w.WildGrowth.class));
        cards.add(new SetCardInfo("Wind Spirit", 106, Rarity.UNCOMMON, mage.cards.w.WindSpirit.class));
        cards.add(new SetCardInfo("Wings of Aesthir", 305, Rarity.UNCOMMON, mage.cards.w.WingsOfAesthir.class));
        cards.add(new SetCardInfo("Withering Wisps", 168, Rarity.UNCOMMON, mage.cards.w.WitheringWisps.class));
        cards.add(new SetCardInfo("Woolly Mammoths", 278, Rarity.COMMON, mage.cards.w.WoollyMammoths.class));
        cards.add(new SetCardInfo("Woolly Spider", 279, Rarity.COMMON, mage.cards.w.WoollySpider.class));
        cards.add(new SetCardInfo("Word of Blasting", 224, Rarity.UNCOMMON, mage.cards.w.WordOfBlasting.class));
        cards.add(new SetCardInfo("Word of Undoing", 108, Rarity.COMMON, mage.cards.w.WordOfUndoing.class));
        cards.add(new SetCardInfo("Wrath of Marit Lage", 109, Rarity.RARE, mage.cards.w.WrathOfMaritLage.class));
        cards.add(new SetCardInfo("Yavimaya Gnats", 280, Rarity.UNCOMMON, mage.cards.y.YavimayaGnats.class));
        cards.add(new SetCardInfo("Zur's Weirding", 110, Rarity.RARE, mage.cards.z.ZursWeirding.class));
        cards.add(new SetCardInfo("Zuran Enchanter", 111, Rarity.COMMON, mage.cards.z.ZuranEnchanter.class));
        cards.add(new SetCardInfo("Zuran Orb", 350, Rarity.UNCOMMON, mage.cards.z.ZuranOrb.class));
        cards.add(new SetCardInfo("Zuran Spellcaster", 112, Rarity.COMMON, mage.cards.z.ZuranSpellcaster.class));
    }
}
