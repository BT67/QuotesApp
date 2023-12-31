package com.garo.quotesapp

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_main_activity)

        val quotes = arrayOf(
            "We may be few, and our enemies many. Yet so long as there remains one of us still fighting, one who still rages in the name of justice and truth, then there will still be hope.",
            "An open mind is like a fortress with its gates unbarred and unguarded.",
            "To give his life so that his brothers may live and his enemies be defeated. A warrior can ask for no better death than that.",
            "So let it be written, so let it be done.",
            "Everything has a purpose. So the Emperor ordains.",
            "There can only be two sides in a fight - choose carefully, lest you and I find ourselves on different sides.",
            "The hope of the Emperor's intervention steels warriors' hearts and lends strength to their conviction. They hold out against impossible odds and offer up prayers to the Emperor that he may notice their plight. They fight harder, knowing that if they do so he might intervene.",
            "We must utterly defeat our enemies and erase all trace of their existence, lest they do the same to us.",
            "I stand alongside warriors of honour, and the warrior who acts out of honour cannot fail. His duty is honour itself. Even a warrior's death--if it is honourable--is a reward and can be no failure, for it has come through duty. Seek honour as you act, and you will know no fear. Above all remember this... for a warrior the only crime is cowardice.",
            "Be proud to live - be proud to die.",
            "There is no enemy. The foe on the battlefield is merely the manifestation of that which we must overcome. He is doubt, and fear, and despair. Every battle is fought within. Conquer the battlefield that lies inside you, and the enemy disappears like the illusion he is.",
            "Raise the flag high. Let those degenerates know who comes to deliver the Emperor's judgement.",
            "True justice is quite simply the will of the Emperor.",
            "Whatever the Emperor's will is, be sure it will find you out.",
            "There is no such thing as a minor detail. One cannot and should not dismiss any data until one is in a position to evaluate its significance, and that only comes with hindsight. So every detail is important until circumstances render it redundant.",
            "Be pure of heart and strong of body, untainted by doubt and unsullied by arrogance.",
            "Have little but contempt for authority that is bestowed rather than earned.",
            "A foe without honour is a foe already beaten.",
            "Praise the sun that brings the dawn of your final day.",
            "So it was in the beginning, so ever it shall be.",
            "Where the mind hesitates, overcome it. Where the body fails, strengthen it.",
            "Let them think us beaten. We shall teach them otherwise.",
            "Victory is nothing more than survival. It carries no weight of honour or worth beyond what we ascribe to it.",
            "If you wish to grow wise, learn why brothers betray brothers.",
            "Hatred of what is natural, of what is human, is the first and greatest of the corruptions.",
            "Make war and move on, and again, and again, until nothing breathes which stands against you.",
            "Faith is purest when it is unquestioning.",
            "In the name of the Emperor, to whom we owe all.",
            "The Emperor protects.",
            "Attack without warning, mercy or hesitation. Let your enemies know that you will destroy every last one of them, and let them tremble in fear.",
            "Know that you are the harbinger of your own freedom.",
            "Beat your thoughts to the mould of your will.",
            "Harden your soul against decadence. But do not despise it, for the soft appearance of the decadent is often a deception.",
            "He today that sheds his blood with me shall be my brother eternal.",
            "In the darkness all men are equal, save those that embrace it.",
            "Attack before the enemy even realises that the fight has begun. Strike hard at his vital weaknesses, seek out his fragilities and smite them with every weapon at your disposal.",
            "If the enemy has taken the advantage through shock and surprise, your counter-advantage must be a lack of convention.",
            "Each path must be chosen with care, lest disaster consume us whole.",
            "The minute we turn on our own brothers and murder them, we might as well take a blade to our throats.",
            "Every life is vital, no matter how seemingly insignificant.",
            "Forget nothing - forgive no-one.",
            "Grant the repentant a merciful end.",
            "Hope for the best, but prepare for the worst.",
            "He who forgets his duty is no longer human. He becomes something less than a wild beast. He will have no place in the bosom of humanity nor in the heart of the Emperor. Let him die and be forgotten.",
            "A good soldier obeys without question. A good officer commands without doubt.",
            "It is not his weapon that makes a man a warrior, but the way he wields it.",
            "I have known many politicians over the years. The ones who weren't incompetent were either corrupt, insane, or both.",
            "I have faced more men in battle than I care to contemplate, and in my experience it was never wise to underestimate any of them.",
            "Never look down on your enemy. A child can pull a trigger just as well as a veteran.",
            "No remorse, no mercy, no forgiveness. Not a single step back, not a single moment of hesitation. You will not succumb to fear or doubt, and you will relent only after you have given your last moment for the Emperor. Nothing less than this will be tolerated.",
            "Give any man the power of a god, and you better hope he's got the wisdom and morals of a god to match.",
            "It is not enough that I achieve victory - my enemy must suffer total defeat. It is not enough that I kill - all my foes must die. It is not enough that I succeed - all others must fail.",
            "Nothing brings victory half as sure as killing the enemy before he knows he’s in a fight.",
            "The meaning of victory is not merely to defeat your enemy but to destroy him, to completely eradicate him from living memory, to leave no remnant of his endeavours, to crush utterly his achievements and remove from all record every trace of his existence. From that defeat no enemy can ever recover. That is the meaning of victory.",
            "Always lead from the front. Never expect a man under your command to undertake an action you would not be prepared to undertake yourself.",
            "Rise up swiftly to smash the foe and vanish as swiftly, leaving no trace of your presence but the damage wrought.",
            "A small mind is easily filled with faith.",
            "It is always better to find your enemy before he finds you.",
            "Competence on the battlefield is a myth.  Whichever side makes the fewest mistakes wins.",
            "I do not love the sword for its sharpness, nor the arrow for its swiftness, nor the warrior for his glory. I only love that which they defend.",
            "As above, so below.",
            "All we have to decide is what to do with the time that is given to us.",
            "One often finds his destiny on the road he takes to avoid it.",
            "Deeds that go unpraised are no less heroic.",
            "A Heretic may see the truth and seek redemption. He will be forgiven his past and will be absolved in death. A Traitor can never be forgiven. A Traitor will never find peace in this world or the next. There is nothing as wretched or as hated in all the world as a Traitor.",
            "There are no miracles. There are only men.",
            "If the road is easy, the destination is worthless.",
            "A single man with faith can triumph over a legion of the faithless. Untold billions of the faithful can never be opposed.",
            "A war waged by committee is a war already lost.",
            "If an archer shoots for fun he has all his skill, but if he shoots for a prize his hands tremble and his breath is uneasy. His skill was not lessened, but his vision of the target changed him.",
            "The rewards of tolerance are treachery and betrayal.",
            "Use only that which works, and take it from any place you can find it.",
            "If an injury has to be done to a man it should be so severe that his vengeance need not be feared.",
            "Never attempt to win by force what can be won by deception.",
            "He who seeks to deceive will always find someone who will allow himself to be deceived.",
            "He who wishes to be obeyed must know how to command.",
            "One who desires constant success must change his conduct with the times."
        )

        val txt_quote = findViewById<TextView>(R.id.text_home)
        txt_quote.movementMethod = ScrollingMovementMethod();
        txt_quote.getBackground().setAlpha(150)

        findViewById<Button>(R.id.btn_refresh)?.setOnClickListener {
            // Code here executes on main thread after user presses button
            txt_quote.text = "\"" + quotes[(quotes.indices).random()] + "\"";
        }

        MobileAds.initialize(this) {}

        val adViewTop = findViewById<AdView>(R.id.adViewTop)
        val adViewBottom = findViewById<AdView>(R.id.adViewBottom)
        val adRequest = AdRequest.Builder().build()

        adViewTop.loadAd(adRequest)
        adViewBottom.loadAd(adRequest)

    }
}