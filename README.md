# DISCOV

Project submitted to Stanford University TreeHacks 2021.

## Inspiration

A couple of months ago, the South Korean government confronted a huge dilemma. Their method of controlling positive and suspected COVID-19 patients was very effective yet quite controversial. What did they do? 

Once a patient tested positive for COVID-19, emergency alerts that included information about the patient, where the patient went for the past couple of days with exact time stamps, his or her address, etc were sent out to the entire city from the government. This was certainly effective in stopping the spread of a pandemic yet the side effect was severe. Shop owners had to shut down their business because nobody wanted to visit a shop that has been publicly listed as "contaminated by COVID-19 patient". Criminals used leaked information to plan fraudulent crimes.  

We believe that the idea was heading in the right direction, but the method was irrational. "Why not create a COVID-19 notification system that protects both health and privacy?" was our initial question. 


## What it does

The name of our app, DISCOV, is a wordplay that describes its role. It means "to DISCOVer hidden COVid contacts" and "to DIS (Latin prefix for 'away from') COVID". DISCOV is a contact tracing and COVID-19 symptom detection app using biometrics by Fitbit. But this isn't "just another COVID project". 

_We use coordinates of words instead of GPS to track people. We measure heart rates instead of temperature to diagnose COVID-19_

A recent Stanford research published in Nature partner journals suggested that they can successfully identify early COVID-19 positive cases based on the metrics measured by Fitbit. COVID-19 patients have significantly higher resting heart rate (RHR) and heart rate over step (HROS). They were able to correctly flag COVID positives even before the patients had other symptoms such as cough or fever. Last Wednesday, NASA announced that they will be using Fitbit to monitor astronauts and their employees for COVID-19 symptoms. We are trying to make it available for everyone by our app. 

Another aspect that we tried to tackle is contact tracing using what3words API. It assigns 3 words to every 3 by 3 meter squares on Earth. For example, the College of Computing building of Georgia Tech corresponds to (escape, sweeper, pump). If a COVID positive patient was in a certain "square", it means that individuals that were in the same square at the same time with the patient are at risk of being infected. Using what3words tracking system has more efficient data-handling compared to GPS as accuracy (such as pointing out exactly where in the square a person was located) is not required. In addition, what3words can secure the user's privacy, unlike GPS. 

Here is the logic: 

1. When two or more Fitbit users are in the same what3words square, our app will record the userIDs and time of contact. We will not store any location data to respect your privacy

2. If one of the Fitbit users in the square has an unusual RHR or HROS rate (measured with Fitbit), we send out updates to other app users who were in that square as a warning. 

3. In order to secure privacy, we only notify the user that he or she had a suspected contact that day. The user cannot know who was the positive patient or where the contact happened, but the notified information is sufficient enough to alarm the users. 

In addition to this, our application provides Fitbit-synced features and self-diagnosis platforms as well. Check out our demo video for more information! 
 

## How we built it

We used Android Studio (with Java) to develop the general app. Fitbit and what3words APIs were used for the notification system explained above. Chart js was used for data visualization in showing the users the positive/suspected COVID-19 contacts they had. 

In addition to technical development, information specific to COVID-19 diagnosis were obtained from the Stanford University research, NASA proposals, and US CDC guidelines. Inspirational case studies were conducted with South Korean residents who have experienced the governmental notification system. 

## Challenges we ran into

As mentioned in the "Inspiration" section, we strived to develop an app that protects users' privacy while also protecting their health. We initially planned to use Google Maps API but as mentioned in the "What it does" section, mass data-handling and user privacy became an issue. As a solution that we came up with after thorough research, we used what3words API instead. We had experience with Google Maps API before so this challenge was fairly interesting. 

There are tons and tons of COVID-themed projects and developments launched in the market. We did not want to make DISCOV a "one of those apps". We hope our relatively fresh approaches to diagnosis and tracking systems interest the judges and of course the users. 


## Accomplishments that we're proud of

During the past hackathons, we were more focused on solving only the technical challenges. How do we handle this API, how should we implement this, or why am I having a compile error and why is it gone now were the questions we asked ourselves three in the morning. 

But for developing DISCOV, we tried to also focus creativity as user privacy/ethics by studying current events and understanding the social controversies. Reading biomedical and business research papers while coding three in the morning was quite memorable. 


## What we learned

We learned that making a choice between an option that would make the development process easier and an option that is beneficial to users is a huge dilemma. For example, there were various APIs out there we could use more easily without considering the users. However, we tried not to forget what we had as an inspiration for masking DISCOV. 


## What's next for DISCOV

We hope to collect more user data and conduct user testing. My teammate and I are planning to work further on this app. 
